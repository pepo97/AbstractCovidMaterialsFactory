public class MaterialFactory extends AbstractFactory {

	@Override
	Protection set(String material) {
		// Material factory does not have set implementation
		return null;
	}

	@Override
	Material get(String material) {

		if(material.equals("MASK")) {
			return new Mask();
		}
		
		if(material.equals("GLASSES")) {
			return new Glasses();
		}
		
		System.out.println("Unknown shape type");
		return null;
	}

}
