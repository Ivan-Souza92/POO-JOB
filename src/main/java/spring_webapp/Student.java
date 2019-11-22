package spring_webapp;

import java.util.LinkedHashMap;

public class Student {
	
	private String firstName;
	private String lastName;
	private String country;
	private LinkedHashMap <String, String> countryOptions;
	private String favoriteLanguage;
	private String[] operationSystems;

	
	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public void setOperationSystems(String[] operationSystems) {
		this.operationSystems = operationSystems;         // foi alterado a ordem , primeiro é atribuido o valor e depois apresenta a mensagem com os dados alterados
		operationSystems.toString();                     //retirado o system.out.println,pois o método ToString é um método virtual do tipo object e retorna uma representação de string
	}
	
	public String[] getOperationSystems() {
	                                             // foi retirado o System.out.println , pois, já é feito o retorno na linha seguinte 
		return operationSystems;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
		
	}

	public Student() {
		countryOptions = new LinkedHashMap<String, String>();
		
		countryOptions.put("BR", "Brazil");
		countryOptions.put("GE", "Germany");
		countryOptions.put("FR", "France");
		countryOptions.put("IN", "India");
		
	}

	public String getFirstName() {
		return firstName;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
