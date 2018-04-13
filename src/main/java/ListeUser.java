import java.util.ArrayList;
import java.util.Iterator;

public class ListeUser {
	
	public static void main(String[] args) {
		
		//Creation of five different User
		ArrayList<User> users = new ArrayList();
		User u1 = new User("fuegfiz", 24, true);
		users.add(u1);
		User u2 = new User("ehez", 45, false);
		users.add(u2);
		User u3 = new User("geshtrh", 222, true);
		users.add(u3);
		User u4 = new User("yukyj", 28, true);
		users.add(u4);
		User u5 = new User("zerqze", 44, false);
		users.add(u5);
		
		printUsers(users);
		
		System.out.println();
		removeFemale(users);
		printUsers(users);

		
	}
	
	/**
	 * Print tous les User de la liste users
	 * @param La liste des User à afficher
	 */
	public static void printUsers(ArrayList<User> users) {
		for(int i=0;i<users.size();i++) {
			//Iterator<User> it = users.iterator();
			System.out.println(users.get(i).toString());
		}
	}
	
	/**
	 * Supprime dans la liste users tous les User ayant isMale=false
	 * @param La liste des User
	 */
	public static void removeFemale(ArrayList<User> users) {
		for(int i=0;i<users.size();i++) {
			Iterator it = users.iterator();
			if(it.hasNext()) {
				if(!users.get(i).isMale())
					users.remove(i);
			}
		}
	}

}
