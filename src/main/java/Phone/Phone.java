package Phone;

public class Phone<T, V extends Number> implements ModulePhone{

    String modelName;

    T id;

    V ram;

    int core;

    int bc;
    int price;

    /**
     * конструктор
     *
     * @param modelName фирма
     * @param id айди
     * @param ram озу
     * @param core ядро
     * @param bc батарея
     * @param price цена
     */
    public Phone(String modelName, T id, V ram, int core, int bc, int price) {
        this.modelName = modelName;
        this.id = id;
        this.ram = ram;
        this.core = core;
        this.bc = bc;
        this.price = price;
    }

    @Override
    public String getModelName() {
        return modelName;
    }

    @Override
    public void setModelName(String model) {
        this.modelName = model;
    }

    @Override
    public T getID() {
        return id;
    }

    @Override
    public void setID(Object value) {
        this.id = (T) value;
    }

    @Override
    public V getRAM() {
        return ram;
    }

    @Override
    public void setRAM(Number value) {
        this.ram =(V) value;
    }


    @Override
    public int getCore() {
        return core;
    }

    @Override
    public void setCore(int value) {
        this.core = value;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int getBatteryCapacity() {
        return bc;
    }

    @Override
    public void setBatteryCapacity(int value) {
        this.bc = value;
    }
}
