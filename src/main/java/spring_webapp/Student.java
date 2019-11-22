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
		this.operationSystems = operationSystems;         // foi alterado a ordem , primeiro � atribuido o valor e depois apresenta a mensagem com os dados alterados
		operationSystems.toString();                     //retirado o system.out.println,pois o m�todo ToString � um m�todo virtual do tipo object e retorna uma representa��o de string
	}
	
	public String[] getOperationSystems() {
	                                             // foi retirado o System.out.println , pois, j� � feito o retorno na linha seguinte 
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
