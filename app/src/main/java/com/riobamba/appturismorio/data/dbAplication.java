package com.riobamba.appturismorio.data;

import android.app.Application;
import android.database.Cursor;

import com.riobamba.appturismorio.data.modelo.modeloImagen;
import com.riobamba.appturismorio.data.modelo.modeloLugar;
import com.riobamba.appturismorio.data.utils.CursorToCollection;

import java.util.ArrayList;

/**
 * Created by lllum on 15/12/2016.
 */

public class dbAplication extends Application {

    dbManager dbManager;

    @Override
    public void onCreate() {
        dbManager = new dbManager(getApplicationContext());
        dbManager.open();

        rellenarDatos();

        super.onCreate();
    }

    public void onTerminate(){
        dbManager.close();
        super.onTerminate();
    }

   public void rellenarDatos()
    {


        //<editor-fold desc="IGLESIA LA MERCED">
        modeloLugar objModeloLugarMerced= new modeloLugar("1","Iglesia la merced","Eugenio Espejo y Guayaquil","En la presidencia de Gabriel García Moreno (año 1871), se inició la construcción de este templo, en un principio fue ocupado por las religiosas del Sagrado Corazón de Jesús, luego por las Hermanas de la Caridad y en 1891 fue cedido a los Salesianos de Don Bosco, donde funcionaban talleres artesanales. La construcción del templo pudo realizarse gracias a los donativos, materiales y limosnas que se colectaba entre los devotos de la Virgen de las Mercedes. En la imagen de la Virgen consta la leyenda “Una limosnita para mi templo”.","-094954395","-987859");
        dbManager.insertarLugar(objModeloLugarMerced);
        modeloImagen objModeloImagenMerced1= new modeloImagen("1","Iglesia la merced","iglesias/LAMERCED01.jpg",objModeloLugarMerced);
        dbManager.insertarImagen(objModeloImagenMerced1);
        modeloImagen objModeloImagenMerced2= new modeloImagen("2","Iglesia la merced","iglesias/LAMERCED02.jpg",objModeloLugarMerced);
        dbManager.insertarImagen(objModeloImagenMerced2);
        modeloImagen objModeloImagenMerced3= new modeloImagen("3","San Antonio de Padua","iglesias/LAMERCED03.jpg",objModeloLugarMerced);
        dbManager.insertarImagen(objModeloImagenMerced3);
        //</editor-fold>

        //<editor-fold desc="IGLESIA CAPILLA DE SANTA BARBARA">
        modeloLugar objModeloLugarBarbara= new modeloLugar("2","Capilla de santa bárbara","Veloz y Espejo (junto a la Iglesia La Catedral)","La capilla fue el bautisterio, lugar donde se encontraba la pila bautismal de la iglesia matriz de la nueva Riobamba. Cuenta la historia que en 1870 una tormenta de rayos cayó sobre el cielo de los riobambeños, quienes del temor oraron a Santa Bárbara para que cesaran las tormentas; el Obispo Dr. José Ordóñez declaró a Santa Bárbara como patrona de la Diócesis. Desde 1885, funciona en esta capilla la Asociación de “La Adoración Perpetua al Santísimo Sacramento” y se la conoce también como la capilla del “Sagrario”.”.","-094954395","-987859");
        dbManager.insertarLugar(objModeloLugarBarbara);
        modeloImagen objModeloImagenBarbara1= new modeloImagen("4","Capilla de santa bárbara","iglesias/SANTABARBARA01.jpg",objModeloLugarBarbara);
        dbManager.insertarImagen(objModeloImagenBarbara1);
        modeloImagen objModeloImagenBarbara2= new modeloImagen("5","Capilla de santa bárbara","iglesias/SANTABARBARA02.jpg",objModeloLugarBarbara);
        dbManager.insertarImagen(objModeloImagenBarbara2);
        modeloImagen objModeloImagenBarbara3= new modeloImagen("6","Capilla de santa bárbara","iglesias/SANTABARBARA03.jpg",objModeloLugarBarbara);
        dbManager.insertarImagen(objModeloImagenBarbara3);
        //</editor-fold>

        //<editor-fold desc="IGLESIA LA BASILICA">
        modeloLugar objModeloLugarBasilica= new modeloLugar("3","Iglesia la basilica","Veloz entre Benalcázar  y Pedro de Alvarado.","La Basílica se encuentra ubicada al frente del Parque La Libertad, esta majestuosa iglesia pertenece al colegio San Felipe Neri, en su altar principal tenemos a la imagen del Sagrado Corazón de Jesús y en su parte inferior, una réplica del cuadro del Milagro de la Virgen Dolorosa de Quito, patrona de la Unidad Educativa. La cúpula principal posee una cruz de 4 metros de altura. Sobre la fachada principal se levanta la estatua de Cristo Rey, colocada en conmemoración del centenario de la Primera Constituyente, en cuyo pie está grabada la frase “A Cristo Rey en el Centenario de la República”.","-094954395","-987859");
        dbManager.insertarLugar(objModeloLugarBasilica);
        modeloImagen objModeloImagenBasilica1= new modeloImagen("7","Iglesia la basilica","iglesias/BASILICA01.jpg",objModeloLugarBasilica);
        dbManager.insertarImagen(objModeloImagenBasilica1);
        modeloImagen objModeloImagenBasilica2= new modeloImagen("8","Iglesia la basilica","iglesias/BASILICA02.jpg",objModeloLugarBasilica);
        dbManager.insertarImagen(objModeloImagenBasilica2);
        modeloImagen objModeloImagenBasilica3= new modeloImagen("9","Iglesia la basilica","iglesias/BASILICA03.jpg",objModeloLugarBasilica);
        dbManager.insertarImagen(objModeloImagenBasilica3);
        //</editor-fold>

        //<editor-fold desc="IGLESIA SAN ALFONSO">
        modeloLugar objModeloLugarAlfonso= new modeloLugar("4","Iglesia san alfonso","Argentinos y 5 de Junio","El italiano San Alfonso María Ligorio, fundó la congregación misionera de los redentoristas, cuyo objetivo fue difundir la religión entre los más pobres. La iglesia toma su nombre debido a que era el lugar en el que llegaban los sacerdotes misioneros redentoristas, quienes salían hacia los cantones de toda la provincia de Chimborazo, en especial a la zona rural en donde realizaban sus misiones y practicaban la palabra de Dios. En su fachada principal se distinguen dos torres, la imagen de la Virgen del Perpetuo Socorro y la estatua de San Alfonso Ligorio.","-094954395","-987859");
        dbManager.insertarLugar(objModeloLugarAlfonso);
        modeloImagen objModeloImagenAlfonso1= new modeloImagen("10","Iglesia san alfonso","iglesias/SANALFONSO01.jpg",objModeloLugarAlfonso);
        dbManager.insertarImagen(objModeloImagenAlfonso1);
        modeloImagen objModeloImagenAlfonso2= new modeloImagen("11","Iglesia san alfonso","iglesias/SANALFONSO02.jpg",objModeloLugarAlfonso);
        dbManager.insertarImagen(objModeloImagenAlfonso2);
        modeloImagen objModeloImagenAlfonso3= new modeloImagen("12","Iglesia san alfonso","iglesias/SANALFONSO03.jpg",objModeloLugarAlfonso);
        dbManager.insertarImagen(objModeloImagenAlfonso3);
        //</editor-fold>

        //<editor-fold desc="IGLESIA CAPILA EL SACRILEGIO">
        modeloLugar objModeloLugarSacrilegio= new modeloLugar("5","Capilla el sacrilegio","Veloz y Juan Velasco ","La capilla pertenece al centenario Colegio Jesuita San Felipe Neri, toma su nombre del sacrilegio suscitado el 4 de mayo de 1897, fecha en la que las tropas alfaristas ingresan con violencia en el templo y colegio imaginando que se encontraban las fuerzas conservadoras en su interior, hecho por el cual murió el Padre Emilio Moscoso, rector de ese entonces. La capilla posee una torre con un reloj de cuatro esferas. En esta capilla los alumnos del colegio celebran las misas diarias a las que asisten como parte de sus estudios","-094954395","-987859");
        dbManager.insertarLugar(objModeloLugarSacrilegio);
        modeloImagen objModeloImagenSacrilegio1= new modeloImagen("13","Capilla el sacrilegio","iglesias/SACRILEGIO01.jpg",objModeloLugarSacrilegio);
        dbManager.insertarImagen(objModeloImagenSacrilegio1);
        modeloImagen objModeloImagenSacrilegio2= new modeloImagen("14","Capilla el sacrilegio","iglesias/SACRILEGIO02.jpg",objModeloLugarSacrilegio);
        dbManager.insertarImagen(objModeloImagenSacrilegio2);
        modeloImagen objModeloImagenSacrilegio3= new modeloImagen("15","Capilla el sacrilegio","iglesias/SACRILEGIO03.jpg",objModeloLugarSacrilegio);
        dbManager.insertarImagen(objModeloImagenSacrilegio3);
        //</editor-fold>

        //<editor-fold desc="IGLESIA LA CONCEPCION">
        modeloLugar objModeloLugarConcepcion= new modeloLugar("6","Iglesia la concepción","Orozco y Colón","La iglesia forma parte del Convento de las Conceptas, en el altar principal de este imponente templo se encuentra la imagen del Señor del Buen Suceso. Cuenta la leyenda que al no poder elaborarse en un principio la imagen del patriarca San José por pedido de las Conceptas de la antigua Riobamba, se ordenó la elaboración de un Cristo coronado por espinas. El artesano trabajó sin problema alguno, los ángeles le ayudaron a terminar la escultura, por este hecho los monasterios quiteños quisieron quedarse con la figura la cual fue imposible moverla hacia otro lugar. El encomendado de las Conceptas fue a retirarla y se dirigió a ella diciendo: “Señor al Convento de la Concepción de Riobamba, Señor” y milagrosamente la imagen dio un paso con el pie derecho, aceptando esta petición, he allí el “Buen Suceso”.","-094954395","-987859");
        dbManager.insertarLugar(objModeloLugarConcepcion);
        modeloImagen objModeloImagenConcepcion1= new modeloImagen("16","Iglesia la concepción","iglesias/CONCEPCION01.jpg",objModeloLugarConcepcion);
        dbManager.insertarImagen(objModeloImagenConcepcion1);
        modeloImagen objModeloImagenConcepcion2= new modeloImagen("17","Iglesia la concepción","iglesias/CONCEPCION02.jpg",objModeloLugarConcepcion);
        dbManager.insertarImagen(objModeloImagenConcepcion2);
        modeloImagen objModeloImagenConcepcion3= new modeloImagen("18","Iglesia la concepción","iglesias/CONCEPCION03.jpg",objModeloLugarConcepcion);
        dbManager.insertarImagen(objModeloImagenConcepcion3);
        //</editor-fold>

        //<editor-fold desc="IGLESIA LA CATEDRAL">
        modeloLugar objModeloLugarCatedral= new modeloLugar("7","Iglesia la catedral","Veloz entre Espejo y 5 de Junio","Sobre el Parque Maldonado o Plaza Mayor, se levanta el templo más importante de la ciudad, su fachada es un valioso patrimonio histórico, pues fue reconstruido después del terremoto de 1797 con las piedras de la antigua Riobamba, que se localizaba en Cajabamba.  En sus piedras se pueden interpretar pasajes de la Bíblia, posee tres torres, las dos laterales poseen campanas, mientras que, la del centro y más grande, contiene la estátua de San Pedro, patrono de la ciudad. En el interior se encuentra un mural elaborado por el Premio Nobel de la Paz, Adolfo Pérez Esquivel, donde se puede apreciar un Cristo Indio o Cristo del Poncho. “El Cristo está en la Cruz, pero no está crucificado, es el Cristo de la Esperanza en los pueblos” manifestó Pérez Esquivel.","-094954395","-987859");
        dbManager.insertarLugar(objModeloLugarCatedral);
        modeloImagen objModeloImagenCatedar1= new modeloImagen("19","Iglesia la catedral","iglesias/CATEDRAL01.jpg",objModeloLugarCatedral);
        dbManager.insertarImagen(objModeloImagenCatedar1);
        modeloImagen objModeloImagenCatedar2= new modeloImagen("20","Iglesia la catedral","iglesias/CATEDRAL02.jpg",objModeloLugarCatedral);
        dbManager.insertarImagen(objModeloImagenCatedar2);
        modeloImagen objModeloImagenCatedar3= new modeloImagen("21","Iglesia la catedral","iglesias/CATEDRAL03.jpg",objModeloLugarCatedral);
        dbManager.insertarImagen(objModeloImagenCatedar3);
        //</editor-fold>


        //<editor-fold desc="IGLESIA SAN ANTONIO">
        modeloLugar objModeloLugarAntonio= new modeloLugar("8","Iglesia san antonio de padua","loma de quito","Este iglesia posee un estilo neogótico, se destacan las ventanas en forma de ojivas y la construcción de la edificación es de piedra y ladrillo visto. Pertenece al Monasterio de religiosas concepcionistas. Constituye una belleza arquitectónica y de gran valor cultural.","-094954395","-987859");
        dbManager.insertarLugar(objModeloLugarAntonio);
        modeloImagen objModeloImagenAntonio1= new modeloImagen("22","San Antonio de Padua","iglesias/SANANTONIO01.jpg",objModeloLugarAntonio);
        dbManager.insertarImagen(objModeloImagenAntonio1);
        modeloImagen objModeloImagenAntonio2= new modeloImagen("23","San Antonio de Padua","iglesias/SANANTONIO02.jpg",objModeloLugarAntonio);
        dbManager.insertarImagen(objModeloImagenAntonio2);
        modeloImagen objModeloImagenAntonio3= new modeloImagen("24","San Antonio de Padua","iglesias/SANANTONIO03.jpg",objModeloLugarAntonio);
        dbManager.insertarImagen(objModeloImagenAntonio3);

        //</editor-fold>










    }
    public ArrayList<String> getNombresLugar()
    {
        Cursor c=dbManager.cursorCargarInformacion("1");
        return CursorToCollection.cursorToArrayNombres(c);

    }

    public String getDescripcion(String nombreLugar)
    {
        Cursor c=dbManager.cursorCargarInformacion(nombreLugar);
        return CursorToCollection.cursorToArrayDescripcion(c);    }

    /*public ArrayList<String> getRuta(String nombre)
    {
        Cursor c=dbManager.cursorCargarImagenes(nombre);
        return CursorToCollection.cursorToArrayNombres(c);

    }*/
    public String[] getRuta(String name)
    {
        Cursor c=dbManager.cursorCargarImagenes(name);
        return CursorToCollection.cursorToString(c);
    }




}
