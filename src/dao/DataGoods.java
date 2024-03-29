/*
Arthor: kimoyami
 */
package dao;

import srv.goods.Goods;

import java.sql.ResultSet;
import java.util.Vector;

public class DataGoods {
    public static int exist(String goodsName, String sta){
        try {
            String sql = "select * from goods where goodsname = '"+goodsName+"' and tag = "+sta+"";
            ResultSet rs = DataBase.s.executeQuery(sql);
            if(!rs.next()) return 0;
            return 1;
        }catch (Exception e){
            return -1;
        }
    }

    public static int insert(Goods goods) {
        try {
            String sta;
            if(goods.getTag() == 0) sta = "Yes";
            else sta = "No";
            if(exist(goods.getName(), sta) == 1) return 0;
            String sql = "insert into goods(idx, cnt, goodsname, price, url, tag) values ('" + goods.getID() + "', "+ goods.getNumber() +", '"+goods.getName()+"', "+goods.getPrice()+", '"+goods.getPicturePath()+"', "+sta+")";
            DataBase.s.executeUpdate(sql);
            DataBase.c.commit();
            return 1;
        }catch (Exception e){
            return -1;
        }
    }

    public static int delete(Goods goods){
        try {
            String sta;
            if (goods.getTag() == 0) sta = "Yes";
            else sta = "No";
            String sql = "delete from goods where idx = '" + goods.getID() + "' and goodsname = '" + goods.getName() + "' and tag = " + sta + "";
            DataBase.s.executeUpdate(sql);
            DataBase.c.commit();
            return 1;
        }catch (Exception e){
            return -1;
        }
    }

    public static Vector<Goods> query(String name, int tag){
        Vector<Goods> res = new Vector<>();
        try{
            String sta;
            if(tag == 0) sta = "Yes";
            else sta = "No";
            String sql = "select * from goods where goodsname = '"+name+"' and tag = "+sta+"";
            ResultSet rs = DataBase.s.executeQuery(sql);
            while(rs.next()){
                Goods tmp = new Goods(rs.getString(2), rs.getInt(3), rs.getString(4), rs.getDouble(5), rs.getString(6), rs.getInt(7));
                res.addElement(tmp);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return res;
    }

    public static void main(String args[]){
        DataBase.start();
    }
}
