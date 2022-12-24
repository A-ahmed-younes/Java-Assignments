module ma.enset.GestionClientsCommandes {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens ma.enset.GestionClientsCommandes to javafx.fxml;
    exports ma.enset.GestionClientsCommandes;
    exports ma.enset.GestionClientsCommandes.Etities;
    opens ma.enset.GestionClientsCommandes.Etities to javafx.fxml;
    exports ma.enset.GestionClientsCommandes.Services;
    opens ma.enset.GestionClientsCommandes.Services to javafx.fxml;
    exports ma.enset.GestionClientsCommandes.DataAccessObject;
    opens ma.enset.GestionClientsCommandes.DataAccessObject to javafx.fxml;


}