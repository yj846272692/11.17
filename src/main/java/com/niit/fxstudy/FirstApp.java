package com.niit.fxstudy;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import javax.print.DocFlavor;
import java.awt.*;
import java.net.URL;

/**
 * 第一个使用了maven和bootstrap以及各种布局的JavaFX程序
 * @author 杨晶
 * 2018-11-17
 */

public class FirstApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        //加载布局文件
        URL location = getClass().getResource("/fxml/main.fxml");
        FXMLLoader fxmlLoader = new FXMLLoader(location);
        BorderPane borderPane = fxmlLoader.load();
        //获取屏幕大小
        Dimension screenSize =  Toolkit.getDefaultToolkit().getScreenSize();
        Scene scene = new Scene(borderPane,screenSize.width,screenSize.height);
        scene.getStylesheets().addAll("org/kordamp/bootstrapfx/bootstrapfx.css",
                "/css/style.css");
        primaryStage.setTitle("通讯录");
        //设置窗体logo
        primaryStage.getIcons().add(new Image("/img/logo.png"));
        primaryStage.setScene(scene); //舞台设置场景
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);

    }
}
