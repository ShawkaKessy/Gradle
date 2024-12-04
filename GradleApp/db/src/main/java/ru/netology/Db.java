package ru.netology;

import java.util.UUID;

public class Db {

    private DbSettings dbSettings;
    private MyEntity myEntity;

    public Db(DbSettings dbSetting) {
        this.dbSettings = dbSetting;
        myEntity = new MyEntity("first");
        myEntity.setId(UUID.randomUUID());
    }

    public DbSettings getDbSetting() {
        return dbSettings;
    }

    public MyEntity getMyEntity() {
        return myEntity;
    }

    public void setMyEntity(MyEntity myEntity) {
        this.myEntity = myEntity;
    }
}
