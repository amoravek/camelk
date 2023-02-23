package cz.trask.camelk;

import java.util.Objects;

public class CamelKBean {

	private String someData;

	public String getSomeData() {
		return someData;
	}

	public void setSomeData(String someData) {
		this.someData = someData;
	}

	@Override
	public int hashCode() {
		return Objects.hash(someData);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CamelKBean other = (CamelKBean) obj;
		return Objects.equals(someData, other.someData);
	}

}
