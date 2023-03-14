package com.ioc;


/**
 * @Author ws
 * @create 2023/3/13 11:46
 * @Description
 */
public class FXNewProvider  implements  FXInjectNewsListener{
    //依赖IFNewsListener来帮助抓取新闻内容
    private IFXNewListener newsListener;
    //IFXNewPersistener来存储抓取的新闻
    private IFXNewPersistener newsPersistener;

    public void getAndPersistNews(){
        String[] newIds=newsListener.getAvailableNewsIds();
        if(newIds.length==0){
            return;
        }
        for (String newsId:newIds){
            FXNewsBean newsBean=newsListener.getNewsByPK(newsId);
            newsPersistener.postProcessIfNecessary(newIds);
        }

    }

    /**
     * 构造方法注入
     * @param newsListener
     * @param newsPersistener
     */
    public FXNewProvider(IFXNewListener newsListener, IFXNewPersistener newsPersistener) {
        this.newsListener = newsListener;
        this.newsPersistener = newsPersistener;
    }

//    public FXNewProvider() {
//        this.newsListener=new DowsJonesNewsListener();
//        this.newsPersistener=new DowJonesNewsPersister();
//    }


    //setter和getter方法注入
    public IFXNewListener getNewsListener() {
        return newsListener;
    }

    public void setNewsListener(IFXNewListener newsListener) {
        this.newsListener = newsListener;
    }

    public IFXNewPersistener getNewsPersistener() {
        return newsPersistener;
    }

    public void setNewsPersistener(IFXNewPersistener newsPersistener) {
        this.newsPersistener = newsPersistener;
    }


    @Override
    public void setNewsListener(IFXNewListener ifxNewListener, IFXNewPersistener ifxNewPersistener) {
        this.newsListener=ifxNewListener;
        this.newsPersistener=(ifxNewPersistener);
    }
}
