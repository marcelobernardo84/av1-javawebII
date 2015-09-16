package dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionFactory {
	
	private static EntityManagerFactory fabrica;
		
	public static EntityManagerFactory getSesssion(){
		try{
			fabrica = Persistence.createEntityManagerFactory("av1PU"); 
		}catch(Throwable ex){
			System.err.println("Falha ao criar a sessão com o banco de dados" + ex);
			throw new ExceptionInInitializerError(ex);
		}
		return fabrica;
	}
}