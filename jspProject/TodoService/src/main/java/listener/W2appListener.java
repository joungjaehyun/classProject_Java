package listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class W2appListener implements ServletContextListener {



    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    }


    public void contextInitialized(ServletContextEvent sce)  { 
    	 // 데이터베이스 드라이버 로드
 		try {
 			
 			Class.forName("com.mysql.cj.jdbc.Driver");
 			System.out.println("mysql driver loads success...");
 		} catch (ClassNotFoundException e) {
 			System.out.println("Driver is not found");
 			e.printStackTrace();
 		}
    }
	
}
