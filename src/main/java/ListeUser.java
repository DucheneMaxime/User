import java.util.ArrayList;
import java.util.Collections;
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
		
		System.out.println("Première liste :");
		printUsers(users);
		
		System.out.println("\nSuppression des User avec isMale=false");
		removeFemale(users);
		printUsers(users);

		System.out.println("\nTri de la liste");
		Collections.sort(users);
		printUsers(users);
		
		ArrayList<User> users2 = new ArrayList();
		User uu1 = new User("AAAAA", 274, false);
		users2.add(uu1);
		User uu2 = new User("BBBB", 745, false);
		users2.add(uu2);
		User uu3 = new User("CCCC", 2722, true);
		users2.add(uu3);
		User uu4 = new User("DDDDDD", 728, false);
		users2.add(uu4);
		User uu5 = new User("EEEEEEEEEEEEEE", 474, false);
		users2.add(uu5);
		
		System.out.println("\nDeuxième liste :");
		printUsers(users2);
		
		ArrayList<User> users3 = new ArrayList<User>();
		users3 = combineLists(users, users2);
		System.out.println("\nLes deux listes combinées :");
		printUsers(users3);
				
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
	
	/**
	 * Combine deux listes de User en une troisième
	 * @param users
	 * @param users2
	 * @return Une troisème liste User avec la liste1 et la liste2 combinée
	 */
	public static ArrayList<User> combineLists(ArrayList<User> users, ArrayList<User> users2){
		ArrayList<User> res = new ArrayList();
		for(int i=0;i<users.size();i++)
			res.add(users.get(i));
		for(int i=0;i<users2.size();i++)
			res.add(users2.get(i));
		return res;
	}

}
