import java.util.*;

class Hashsetjava {

    public static void main(String args[]) {
        HashSet myset = new HashSet<>();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String str = sc.nextLine();

        for (int i = 0; i < n; i++) {
            myset.add(sc.nextLine());
        }

        System.out.println(myset);

        ArrayList al = new ArrayList(myset);

        Iterator<Object> itr = myset.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println(myset.size());
    }
}
