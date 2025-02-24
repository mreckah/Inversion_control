package ma.enset.presentation;

import ma.enset.dao.IDao;
import ma.enset.metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Version2{
    public static void main(String[] args)  {
        try {
            Scanner sc = new Scanner(new File("config.txt"));

            String classname = sc.nextLine();
            Class cDao= Class.forName(classname);
            IDao dao = (IDao) cDao.getConstructor().newInstance();
            System.out.println(dao.getdata());

            String metierClassname=sc.nextLine();
            Class cMetier= Class.forName(metierClassname);
            IMetier metier= (IMetier) cMetier.getConstructor().newInstance();

            Method setDao=cMetier.getMethod("setDao", IDao.class);
            setDao.invoke(metier,dao);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
