package com.github.xhrg.codegen;

import org.apache.commons.io.FileUtils;
import org.springframework.util.StringUtils;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class MainCodegen {

    //组织名称
    public static String groupId = "com.wang.demo";

    //arg名称
    public static String arg = "demo";

    //需要根据组织名称和org名称生成包路径的名称
    public static String packageName = "";

    //原始项目的包路径
    public static String demoPackageName = "com.github.xhrg.demo";

    public static void main(String[] args) throws Exception {
        Stream<Path> l = Files.list(Paths.get(demoPath()));
        System.out.println(l);
        String outPath = "~/temp";
        System.out.println(demoPath());
        writeFile(outPath + "/a.text", "a");
    }

    private static void writeFile(String file, String data) {
        try {
            FileUtils.writeStringToFile(new File(file), data, StandardCharsets.UTF_8);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String demoPath() {
        String demoDir = System.getProperty("DEMO-DIR");
        if (StringUtils.hasLength(demoDir)) {
            return demoDir;
        }
        return System.getProperty("user.dir");
    }
}
