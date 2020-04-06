public class FactoryProducer {
	public static AbstractFactory getFactory(String factory) {
		
		if(factory.equals("MATERIAL")) {
			return new MaterialFactory();
		}
		if(factory.equals("PROTECTION")) {
			return new ProtectionFactory();
		}
		
		System.out.println("Unknown factory type");
		return null;
	}
}
