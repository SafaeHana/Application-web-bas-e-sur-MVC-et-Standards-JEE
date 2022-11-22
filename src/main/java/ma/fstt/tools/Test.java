package ma.fstt.tools;

import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import ma.fstt.dao.ClientDAO;
import ma.fstt.dao.CommandeDAO;
import ma.fstt.dao.LigneCmdDAO;
import ma.fstt.entities.Client;
import ma.fstt.entities.Commande;
import ma.fstt.entities.LigneCmd;


public class Test {

	public static void main(String[] args) throws ParseException, SQLException, ClassNotFoundException {

	
		// --- client ---
//     	Client util = new Client(1, "safae", "safae", "06456789", "safae@gmail.com", "tanger");
//		ClientDAO clientDAO = new ClientDAO();
//		clientDAO.save(util);

		
//		// --- Commande ---
//		String dt = "01/01/2021";
//		java.util.Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dt);
//		Commande commande = new Commande(new Date(date.getTime()), 1);
//		CommandeDAO cmdDao = new CommandeDAO();
//		cmdDao.save(commande);
		
		
		// --- LigneDeCommande ---
//		LigneCmd lcmd = new LigneCmd(1, 10, 1, 1);
//		LigneCmdDAO lcmdDao = new LigneCmdDAO();
//		lcmdDao.save(lcmd);
		
	}

}
