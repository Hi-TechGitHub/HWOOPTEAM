package Phone;

public class NextPhone extends Phone{
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
    public NextPhone(String modelName, Object id, Number ram, int core, int bc, int price, String tokens) {
        super(modelName, id, ram, core, bc, price, tokens);
    }


    @Override
    public String toString() {
        return
                "Фирма - " + modelName  +
                ", ID - " + id +
                ", RAM - " + ram +
                ", CORE - " + core +
                ", Батарея - " + bc +
                ", Цена - " + price +
                ", токены - " + tokens;
    }
}
