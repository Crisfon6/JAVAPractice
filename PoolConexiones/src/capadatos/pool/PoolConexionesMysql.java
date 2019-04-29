/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capadatos.pool;
import java.sql.*;

import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;

/**
 *
 * @author CristhianJavierDelga
 */
public class PoolConexionesMysql {
    public static DataSource getDataSource(){
        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUsername("root");
        ds.setPassword("admin");
        ds.setUrl("jdbc:mysql://localhost:3306/sga?useSSL=false");
        //Definimos el tamaño del pool de conexiones
        ds.setInitialSize(5);//5 conexion iniciales
        return ds;
    }
    public static Connection getConexion() throws SQLException{
        return getDataSource().getConnection();
    }
    
}
