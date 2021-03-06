package ru.goluzov.se;

public class Main {

    public static void main (String[] args) {
        Graph graph = new Graph();
        graph.addVertex("Москва");
        graph.addVertex("Сафоново");
        graph.addVertex("Рязань");
        graph.addVertex("Смоленск");
        graph.addVertex("Липецк");
        graph.addVertex("Тамбов");
        graph.addVertex("Ярцево");
        graph.addVertex("Саратов");
        graph.addVertex("Дорогобуж");
        graph.addVertex("Вязьма");

        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(0,3);
        graph.addEdge(1,4);
        graph.addEdge(2,5);
        graph.addEdge(3,6);
        graph.addEdge(4,9);
        graph.addEdge(5,7);
        graph.addEdge(6,8);
        graph.addEdge(7,9);
        graph.addEdge(8,9);

        graph.bfs("Москва", "Вязьма");

    }
}
