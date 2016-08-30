interface Istack {
    void push(int i);
    int pop();

    default void clear() {
        System.out.println("clear() not implemented");
    }
    static void istatic() {
        System.out.println("static from interfaces");    }
}
