public class ProtectionFactory extends AbstractFactory {

	@Override
	Protection set(String protection) {

		if(protection.equals("FPP1")) {
			return new FactorFPP1();
		}
		
		if(protection.equals("FPP2")) {
			return new FactorFPP2();
		}
		
		// Unknown protection
		return null;
	}

	@Override
	Material get(String material) {
		// protection factory does not have get implementation
		return null;
	}

}
