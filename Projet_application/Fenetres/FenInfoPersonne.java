package vue;

import java.io.File;
import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class FenInfoPersonne extends Stage{
	
	public FenErreurRecherchePresonne() throws IOException{
		this.setTitle("INFORMATION DE LA PERSONNE");
		this.setResizable(false);
		
		Scene laScene = new Scene(creerSceneGraph());
		this.setScene(laScene);
	}

	private Pane creerSceneGraph() throws IOException {
		File fichier = new File("/home/etuinfo/archauvel/Documents/SAES/SAE201/FXML/InfoPersonne.fxml");
		FXMLLoader loader;
		loader = new FXMLLoader(fichier.toURI().toURL());
        Pane root = new Pane();
		root = loader.load();
     	return root;
	}
}
