package dao.databaseConnection;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

    public class DataBaseConfigReader{
        private Properties properties;

        public DataBaseConfigReader() {
            load();
        }

        private void load() {
            properties = new Properties();
            try {
                FileInputStream in = new FileInputStream("C:\\Users\\Vlad\\IdeaProjects\\Bank\\src\\main\\resources\\DataBaseConfig.properties");
                properties.load(in);
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        public String get(String name) {
            return properties.getProperty(name);
        }
    }

