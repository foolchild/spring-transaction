package com.zhang.transaction.service.impl;

import com.zhang.transaction.service.TransactionService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * by zh
 * 2020/6/21
 * 7种传播事务行为
 * （1）propagation_requierd：如果当前没有事务，就新建一个事务，如果已存在一个事务中，加入到这个事务中，这是Spring默认的选择。
 * （2）propagation_supports：支持当前事务，如果没有当前事务，就以非事务方法执行。
 * （3）propagation_mandatory：使用当前事务，如果没有当前事务，就抛出异常。
 * （4）propagation_required_new：新建事务，如果当前存在事务，把当前事务挂起。
 * （5）propagation_not_supported：以非事务方式执行操作，如果当前存在事务，就把当前事务挂起。
 * （6）propagation_never：以非事务方式执行操作，如果当前事务存在则抛出异常。
 * （7）propagation_nested：如果当前存在事务，则在嵌套事务内执行。如果当前没有事务，则执行与propagation_required类似的操作。
 *
 * 4中隔离级别
 *
 * 1. @Transactional(isolation = Isolation.READ_UNCOMMITTED)：读取未提交数据(会出现脏读,
 *  不可重复读) 基本不使用
 *
 * 2. @Transactional(isolation = Isolation.READ_COMMITTED)：读取已提交数据(会出现不可重复读和幻读)
 *
 * 3. @Transactional(isolation = Isolation.REPEATABLE_READ)：可重复读(会出现幻读)
 *
 * 4. @Transactional(isolation = Isolation.SERIALIZABLE)：串行化
 **/
@Service
public class TransactionServiceImpl implements TransactionService {


    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
    public void requierd() {

    }

    @Transactional(propagation = Propagation.MANDATORY, isolation = Isolation.DEFAULT)
    public void supports() {

    }

    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.DEFAULT)
    public void requiredNew() {

    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED, isolation = Isolation.DEFAULT)
    public void notSupport() {

    }

    @Transactional(propagation = Propagation.NEVER, isolation = Isolation.DEFAULT)
    public void never() {

    }

    @Transactional(propagation = Propagation.NESTED, isolation = Isolation.DEFAULT)
    public void nested() {

    }

}
