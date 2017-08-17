import java.io.File;

/**
 * Created by kvu on 17.08.2017.
 *
 *  stepik-Java-5-1-7
 *  код к решению задачи: Найдите среди приведенных путей два эквивалентных, то есть указывающих на один и тот же файл.
 */
public class Solution {
    public static void main(String[] args) {
        String[] massiv_strok = new String[]{
                "a//b//..//file.txt",
                "a////b////c////file.txt",
                "a////..////b////c////file.txt",
                "a////.////b////..////c////.////file.txt",
                ".////a////b////..////b////c////.////file.txt"};

        for (String stroka_podstanovki : massiv_strok
                ) {

            File file_temp = new File(stroka_podstanovki);
            System.out.println(stroka_podstanovki);
           try {
                System.out.println(file_temp.getCanonicalPath());
            } catch (Exception e) {
            }
            System.out.println("");
        }
    }
}