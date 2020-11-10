import java.util.Iterator;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruitName;
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("cam");
        treeSet.add("tao");
        treeSet.add("chuoi");
        treeSet.add("le");
        treeSet.add("oi");
        System.out.println("cac loai qua co trong TreeSet");
        System.out.println(treeSet);
        System.out.println("Them loai qua moi :");
        fruitName = scanner.nextLine();
        if (!treeSet.contains(fruitName)) {
            treeSet.add(fruitName);
            System.out.println("Loai " + fruitName + " duoc them thanh cong");
            System.out.println("cac loai qua co trong TreeSet:");
            System.out.println(treeSet);
        } else {
            System.out.println("Loai " + fruitName + " da co trong treeSet");
        }
        System.out.println("Nhap ten loai qua muon xoa:");
        fruitName = scanner.nextLine();
        if (treeSet.contains(fruitName)) {
            treeSet.remove(fruitName);
            System.out.println("Loai " + fruitName + " duoc xoa thanh cong");
            System.out.println("TreeSet sau khi xoa:");
            System.out.println(treeSet);
        } else {
            System.out.println("loai " + fruitName + " khong co trong treeSet");
        }

        SortedSet<String> subSet = treeSet.subSet("chuoi", "oi");
        System.out.println("cac Loai qua co trong subSet");
        // subSet duoc duyet bang Iterator
        Iterator<String> iterator = subSet.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "\t");
        }
    }

}
