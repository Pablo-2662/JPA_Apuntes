package entidades;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class ProbandoJPA {

	public static void main(String[] args) {
		
		EntityManagerFactory enFactory = Persistence.createEntityManagerFactory("gestorVideojuegos");
        EntityManager en = enFactory.createEntityManager(); //Gestor de entidades
        
        EntityTransaction tran =en.getTransaction();
        tran.begin();//Empieza la transacción.
        Videojuego j1 = new Videojuego("Star Wars Jedi Survivor","Electronic Arts",2023);
        en.persist(j1);//Persistimos el objecto.
        tran.commit();//Guardar el cambio.
	}

}
