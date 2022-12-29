package com.example.monthlerapi.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JpaMain {

    public static void main(String[] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("monthlerDB");
        EntityManager em = emf.createEntityManager();
        EntityTransaction ts = em.getTransaction();
        ts.begin();

        try {
            Admin admin = new Admin();
            admin.setAdminId("rlftmdtp");
            admin.setPasswd(123456789);
            em.persist(admin);

            Notice notice = new Notice();
            notice.setAdmin(admin);
            em.persist(notice);

            em.flush();
            em.clear();

            Notice findNotice = em.find(Notice.class, notice.getNoticeId());
            List<Notice> list = findNotice.getAdmin().getNotices();

            for(Notice n : list){
                System.out.println("notice = " + n.getNoticeId());
            }

            ts.commit();
        }catch (Exception e){
            ts.rollback();
        }finally {
            em.close();
        }






        emf.close();;
    }
}
