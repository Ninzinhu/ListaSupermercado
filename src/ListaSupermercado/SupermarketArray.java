package ListaSupermercado;

public class SupermarketArray implements Supermarket {

    private final String[] itens;

    private int lastIndex;


    public SupermarketArray(final int size) {
        itens = new String[size];
        lastIndex = -1;
    }

    @Override
    public void add(String item) {
        if (lastIndex == itens.length - 1) {
            System.err.println("Lista de supermercado Cheia");
        } else {
            lastIndex++;
            itens[lastIndex] = item;

        }

    }

    @Override
    public void print() {
        System.out.println("+++++++++++++++++");
        if (lastIndex < 0) {
            System.out.println("Lista Vazia");
        }
        for (int i = 0; i <= lastIndex; i++) {
            System.out.println(i + " - " + itens[i]);
        }
        System.out.println("+++++++++++++++++");

    }

    @Override
    public void delete(int index) {
        if (index >= 0 && index <= lastIndex) {
            shift(index);
            lastIndex--;


        } else
            System.err.println("Indice Inválido: " + index);
    }

    private void shift(int index) {
        for (int i = index; i < lastIndex; i++) {
            itens[i] = itens[i + 1];
        }

    }
}
