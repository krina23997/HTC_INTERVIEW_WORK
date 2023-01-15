import java.util.HashSet;
import java.util.Set;

public class pincode {

    public static int solve(String[] codes) {
        Set<String> set = new HashSet();
        String[] var2 = codes;
        int var3 = codes.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            String code = var2[var4];
            String reversedCode = (new StringBuilder(code)).reverse().toString();
            if (!set.contains(code) && !set.contains(reversedCode)) {
                set.add(code);
            }
        }

        return set.size();
    }

    public static void main(String[] args) {
        String[] code = new String[]{"123", "234", "432", "321", "123", "678", "572", "560"};
        int n = solve(code);
        System.out.println("distinct pin codes are " + n);
    }
}
