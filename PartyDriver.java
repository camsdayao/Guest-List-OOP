/**
 * 
 */
package PARTY;

/**
 * @author CamilleDayao
 *
 */
public class PartyDriver {

	/**
	 * @param args
	 */

		public static void main(String[] args) {
		// TODO Auto-generated method stub

			  Party party = new Party(3, "David Beckham");
			  party.addGuest("Roberto Baggio");
			  party.addGuest("Zinedine Zidane");
			  party.addGuest("Roberto Baggio");
			  party.addGuest("Johan Cruyff");
			  party.addGuest("Diego Maradona");

			  party.printParty();

		}
}
			  