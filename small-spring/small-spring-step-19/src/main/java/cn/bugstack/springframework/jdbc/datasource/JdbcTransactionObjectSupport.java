package cn.bugstack.springframework.jdbc.datasource;

/**
 * @author zhangdd on 2022/2/25
 */
public abstract class JdbcTransactionObjectSupport {

    private ConnectionHolder connectionHolder;

    public ConnectionHolder getConnectionHolder() {
        return connectionHolder;
    }

    public void setConnectionHolder(ConnectionHolder connectionHolder) {
        this.connectionHolder = connectionHolder;
    }

    public boolean hasConnectionHolder() {
        return null != this.connectionHolder;
    }


}
