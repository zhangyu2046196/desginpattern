package com.youyuan.builder;

/**
 * @author zhangy
 * @version 1.0
 * @description  房子(对应角色Product)
 * @date 2019/11/28 11:33
 */
public class House {
    /**
     * 打地基
     */
    private String buildBasic;
    /**
     * 砌墙
     */
    private String buildWalls;
    /**
     * 封顶
     */
    private String roofed;

    public String getBuildBasic() {
        return buildBasic;
    }

    public void setBuildBasic(String buildBasic) {
        this.buildBasic = buildBasic;
    }

    public String getBuildWalls() {
        return buildWalls;
    }

    public void setBuildWalls(String buildWalls) {
        this.buildWalls = buildWalls;
    }

    public String getRoofed() {
        return roofed;
    }

    public void setRoofed(String roofed) {
        this.roofed = roofed;
    }

    @Override
    public String toString() {
        return "House{" +
                "buildBasic='" + buildBasic + '\'' +
                ", buildWalls='" + buildWalls + '\'' +
                ", roofed='" + roofed + '\'' +
                '}';
    }
}
