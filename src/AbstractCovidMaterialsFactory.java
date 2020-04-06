public class AbstractCovidMaterialsFactory {
    public static void main(String[] args) {
        AbstractFactory materialFactory = FactoryProducer.getFactory("MATERIAL");
        Material mask = materialFactory.get("GLASSES");
        mask.get();

        AbstractFactory protectionFactory = FactoryProducer.getFactory("PROTECTION");
        Protection secondLevel = protectionFactory.set("FPP1");
        secondLevel.set();
    }
}
