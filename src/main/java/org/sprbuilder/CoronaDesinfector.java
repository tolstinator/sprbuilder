package org.sprbuilder;

/**
 * @author Tolstonogov Alexey
 */
public class CoronaDesinfector {

    public void start(Room room) {
        // TODO: сообщить всем присутствующим в комнате о начале дезинфекции и попросить всех свалить.
        // TODO: разогнать всех, кто не вышел после объявления.
        desinfect(room);
        // TODO: сообщить всем, что можно вернуться.
    }

    private void desinfect(Room room) {
        System.out.println("Зачитывается молитва: 'корона изыди!' - молитва зачитана, вирус низвергнут в ад.");
    }
}
