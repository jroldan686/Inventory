package jrl.deint.inventory.pojo;

import android.app.Application;

import java.util.ArrayList;

/**
 * Created by usuario on 25/10/17.
 */

public class InventoryApplication extends Application {

    ArrayList<Dependency> dependencies;

    public InventoryApplication() {
        dependencies = new ArrayList();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        addDependency(new Dependency(1, "1º Ciclo Formativo Grado Superior", "1CFGS", "1CFGS Desarrollo Aplicaciones Multiplataforma"));
        addDependency(new Dependency(2, "2º Ciclo Formativo Grado Superior", "2CFGS", "2CFGS Desarrollo Aplicaciones Multiplataforma"));
    }

    /**
     * Método que añade una dependencia
     * @param dependency
     */
    public void addDependency(Dependency dependency) {
        dependencies.add(dependency);
    }

    public ArrayList<Dependency> getDependencies() {
        return dependencies;
    }
}
