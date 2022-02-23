package coreJava;

import java.util.ArrayList;

public final class ImmutableClass{

private final String countryName; 
private final ArrayList listOfStates;

public ImmutableClass(String countryName,ArrayList listOfStates) {
super();
this.countryName = countryName;
//this.listOfStates=listOfStates;

ArrayList tempList = new ArrayList();

for (int i = 0; i < listOfStates.size(); i++) {
 tempList.add(listOfStates.get(i));
}
this.listOfStates = tempList;

}

public String getCountryName() {
return countryName;
}

/*public ArrayList getListOfStates() {
return listOfStates;
}*/

public ArrayList getListOfStates() {
    // Returning cloned object 
 return (ArrayList) listOfStates.clone();
}

public static void main(String args[])
{
ArrayList listOfStates=new ArrayList();
listOfStates.add("Madhya Pradesh");
listOfStates.add("Maharastra");
listOfStates.add("Gujrat");

ImmutableClass country=new ImmutableClass("India",listOfStates);
System.out.println("Country : "+country.getCountryName());
System.out.println("List of states : "+country.getListOfStates());
// It will  not be added to the list because we are using clone in
// getListOfStates
country.getListOfStates().add("Kerala");
// It will not be added to the list because we are using deep copy in
// constructor
listOfStates.add("Rajasthan");
System.out.println("Updated List of states : "+country.getListOfStates());

} 
}