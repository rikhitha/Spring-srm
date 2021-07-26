package autowireType;

public class ScopePrototype 
{
	private String scopeType;

	public ScopePrototype() 
	{
		System.out.println("ScopePrototype Constructor");
		
	}

	@Override
	public String toString() {
		return "ScopePrototype [scopeType=" + scopeType + "]";
	}

	public String getScopeType() {
		return scopeType;
	}

	public void setScopeType(String scopeType) {
		this.scopeType = scopeType;
	}

}
