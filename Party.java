/**
 * 
 */
package PARTY;

import java.util.Arrays;

/**
 * @author CamilleDayao
 *   
 *
 */
public class Party {
	private String nameGuest;
	private String[] arrName;
	private String partyHost;
	private final int MAXNUM;
	
	int i;
	int x=0;
	
	
	public Party(int maxNum, String partyHost) {		//constructor to store the maximum number of guests and the host’s name.
		MAXNUM = maxNum;
		arrName = new String[MAXNUM];
		this.partyHost = partyHost;
	}
	
	public boolean onList() {							//helper method
		if(Arrays.asList(arrName).contains(nameGuest)) {
			return(true);
		}
		else if(!Arrays.asList(arrName).contains(nameGuest)){
			return(false);
		}
		return true;
	}
	
	public String addGuest (String nameGuest) {			//addGuest Method
		this.nameGuest = nameGuest;
		
		for(i = 0; i<arrName.length; i++) {
			if(onList() == true) {
				System.out.println(nameGuest + " is already on the guest list");
				break;
			}
			else if(onList() == false && x<arrName.length) {
				System.out.println(nameGuest);
				arrName[x] = nameGuest;
				x++;
				break;
			}
			else if(x >= arrName.length) {
				System.out.println(nameGuest + " cannot come to the party. The guest list is full.");
				break;
			}
		}
			return nameGuest;
	}
	
	public void printParty() {				//PrintParty method that prints the party’s host and guests.
		System.out.println("\nGuest list for" + partyHost + "'s party:" );
		for (String name : arrName)
		{
		  System.out.println(name);
		}

		}
}

		

