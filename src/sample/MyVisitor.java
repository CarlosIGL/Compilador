package sample;

import carlos.parser.HandlerString;
import carlos.parser.SaludosBaseVisitor;
import carlos.parser.SaludosParser;

import java.util.*;

public class MyVisitor extends SaludosBaseVisitor <sample.Value>{


    public static final double SMALL_VALUE = 0.00000000001;

    private Stack<Integer> pila = new Stack<Integer>();
    private Map<Integer, LinkedHashMap<String,Value>> memoriaprinc = new HashMap<>();
    private LinkedHashMap<String,Value> mapa = new LinkedHashMap<>();
    private LinkedHashMap<String, Value> memoriai = new LinkedHashMap<>();

    private int level = 0;
    private int ultimo;
    private int actual;
    private int tamanio;


    @Override public sample.Value visitImpreso(SaludosParser.ImpresoContext ctx)
    {
        String cadena = ctx.STRING().getText();
        HandlerString handler= new HandlerString(cadena);
        System.out.println(handler.quitarComillas());
        return null;
    }

    @Override public sample.Value visitCor_abierto(SaludosParser.Cor_abiertoContext ctx)
    {
        memoriai=clonar(mapa);
        memoriaprinc.put(level,mapa);
        ultimo=memoriai.size();
        pila.push(ultimo);
        level++;
        return Value.VOID;
    }

    @Override public sample.Value visitCor_cerrado(SaludosParser.Cor_cerradoContext ctx) {
        actual = mapa.size();
        tamanio=actual-pila.pop();
        Set<Map.Entry<String, Value>> entradas = mapa.entrySet();
        Iterator<Map.Entry<String, Value>> iterator = entradas.iterator();
        Map.Entry<String,Value> entry = null, lastEntry= null;
        for (int i=0;i<tamanio;i++){
            while (iterator.hasNext()){
                entry = iterator.next();
                lastEntry = entry;
            }
            mapa.remove(lastEntry.getKey());
        }
        level--;
        return Value.VOID;
    }

    public static <K, V> LinkedHashMap<String ,Value> clonar(Map<String, Value> original){
        return new LinkedHashMap<String, Value>(original);
    }

    @Override public sample.Value visitGuardar(SaludosParser.GuardarContext ctx)
    {

        String variable = ctx.AIDI().getText();
        if (mapa.containsKey(variable)){
            throw new ExceptionVariableRepetida ("La variable "+ctx.AIDI().getText()+" ya fue declarada");
        }
        else {
            mapa.put(variable, null);
            Value value = mapa.get(variable);
            return value;
        }
    }

    @Override public sample.Value visitGuardar2(SaludosParser.Guardar2Context ctx)
    {
        String variable = ctx.AIDI().getText();
        if (mapa.containsKey(variable)){
            throw new ExceptionVariableRepetida ("La variable "+ctx.AIDI().getText()+" ya fue declarada");
        }
        else {
            Value value = this.visit(ctx.expr());
            return mapa.put(variable,value);
        }

    }

    @Override public Value visitAsignar(SaludosParser.AsignarContext ctx)
    {
        if (mapa.containsKey(ctx.AIDI().getText())){
            String codigo = ctx.AIDI().getText();
            Value value = this.visit(ctx.expr());
            memoriai.replace(codigo,value);
            return mapa.replace(codigo,value);
        }
        else {
            throw new ExceptionAsignacion("La variable "+ctx.AIDI().getText()+" no ha sido declarada");
        }
    }

    @Override public sample.Value visitImprmirResu(SaludosParser.ImprmirResuContext ctx)
    {
        sample.Value valor = this.visit(ctx.expr());
        if (valor== null){
            throw new ExcepctionValorNulo("Hay una variable no declarada");
        }
        System.out.println(valor);

        return valor;
    }

    @Override public Value visitMulDiv( SaludosParser.MulDivContext ctx)
    {
        Value izq = this.visit(ctx.expr(0));
        Value der = this.visit(ctx.expr(1));
        if (izq == null | der == null){
            throw new ExcepctionValorNulo("Hay una variable no declarada");
        }

        if (ctx.op.getType() == SaludosParser.POR)
        {
            return new Value(izq.asDouble() * der.asDouble());
        }
        if (der.asDouble() == 0){
                throw new ExceptionErrorDeAritmetica("Infinito");
        }
        else
        {

            return new Value(izq.asDouble() / der.asDouble());
        }
    }

    @Override public sample.Value visitSumRes( SaludosParser.SumResContext ctx)
    {
        Value izq = this.visit(ctx.expr(0));
        Value der = this.visit(ctx.expr(1));
        if (izq == null | der == null){
            throw new ExcepctionValorNulo("Hay una variable no declarada");
        }

        if (ctx.op.getType() == SaludosParser.MAS)
        {
            return new Value(izq.asDouble() + der.asDouble());
        }
        return new Value(izq.asDouble() - der.asDouble());
    }

    @Override public sample.Value visitCondicional(SaludosParser.CondicionalContext ctx)
    {
        Value izq = this.visit(ctx.expr(0));
        Value der = this.visit(ctx.expr(1));
        switch(ctx.op.getType()){
            case SaludosParser.MAY:
                return new Value(izq.asDouble() > der.asDouble());
            case SaludosParser.MEN:
                return new Value(izq.asDouble() < der.asDouble());
            case SaludosParser.MAYI:
                return new Value(izq.asDouble()>= der.asDouble());
            case SaludosParser.MENI:
                return new Value(izq.asDouble() <= der.asDouble());
            default:
                throw new ExceptionTokenDesconocido("El simbolo que ingresaste no es valido");
        }
    }

    @Override public sample.Value visitCondicional2(SaludosParser.Condicional2Context ctx)
    {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case SaludosParser.IG:
                return left.isDouble() && right.isDouble() ?
                        new Value(Math.abs(left.asDouble() - right.asDouble()) < SMALL_VALUE) :
                        new Value(left.equals(right));
            case SaludosParser.DI:
                return left.isDouble() && right.isDouble() ?
                        new Value(Math.abs(left.asDouble() - right.asDouble()) >= SMALL_VALUE) :
                        new Value(!left.equals(right));
            default:
                throw new ExceptionTokenDesconocido("El simbolo que ingresaste no es valido");
        }
    }

    @Override public sample.Value visitAndExpr(SaludosParser.AndExprContext ctx)
    {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        return new Value(left.asBoolean() && right.asBoolean());
    }

    @Override public sample.Value visitOrExpr(SaludosParser.OrExprContext ctx)
    {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        return new Value(left.asBoolean() || right.asBoolean());
    }


    @Override public sample.Value visitParentesis(SaludosParser.ParentesisContext ctx)
    {
        return this.visit(ctx.expr());
    }

    @Override public sample.Value visitInt(SaludosParser.IntContext ctx)
    {
        return new Value(Double.valueOf(ctx.INT().getText()));
    }

    @Override public sample.Value visitVerdadero(SaludosParser.VerdaderoContext ctx)
    {
        return new Value(true);
    }

    @Override public sample.Value visitFalso(SaludosParser.FalsoContext ctx)
    {
        return new Value(false);
    }



    @Override public sample.Value visitId(SaludosParser.IdContext ctx) {
        String id = ctx.AIDI().getText();
        if(mapa.containsKey(id)){
            Value value = mapa.get(id);
            return value;
        }
        return null;
    }

    @Override public sample.Value visitIfelse(SaludosParser.IfelseContext ctx)
    {
        List<SaludosParser.CondicionContext> condicion =  ctx.condicion();


        boolean bloque = false;

        for(SaludosParser.CondicionContext condition : condicion) {

            Value evaluacion = this.visit(condition.expr());

            if(evaluacion.asBoolean()) {
                bloque = true;

                this.visit(condition.bloque_if());
                break;
            }
        }

        if(!bloque && ctx.bloque_if() != null) {
            this.visit(ctx.bloque_if());
        }
        return Value.VOID;
    }

    @Override public sample.Value visitMientras(SaludosParser.MientrasContext ctx)
    {
        Value value = this.visit(ctx.condicion().expr());

        while(value.asBoolean()) {

            this.visit(ctx.condicion().bloque_if());

            value = this.visit(ctx.condicion().expr());
        }

        return Value.VOID;
    }
}
