package Phone;
// каркас телефона
public interface ModulePhone<T, V extends Number> {

    String getModelName();

    void setModelName(String model);

    T getID();

    void setID(T value);

    V getRAM();

    void setRAM(V value);

    int getCore();

    void setCore(int value);


}
