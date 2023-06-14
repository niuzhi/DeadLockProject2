1.里面包含5个死锁案例，分别为DeadLock101.java、DeadLock102.java、DeadLock103.java、DeadLock104.java、DeadLock105.java用于死锁检测工具验证

2.检测结果如下，发现几个都没有检测出来，请验证和分析原因

3.检测log

Analysis Parameters:
-paths: [/media/vdc/software/Eula/Eula_bench/Bug_example]
-ctx: origin
-exclude: null
-timeout: 0
-log: ./logs
-config: config.properties
-debug: false
-source: false
-includeAllMain: true
-mainEntry: null
-exclusions: {nonStaticVar=true, writeWriteRace=false, volatile=true, soleUIThreadRace=false, originThreadObject=true}
-limit: {node=1000000, callTarget=10, nodeRepeat=100, pts=1000}
add jar file: /media/vdc/software/Eula/Eula_bench/Bug_example/DeadLockProject104.jar
add jar file: /media/vdc/software/Eula/Eula_bench/Bug_example/DeadLockProject2.jar
add jar file: /media/vdc/software/Eula/Eula_bench/Bug_example/Deadlock3.jar
add jar file: /media/vdc/software/Eula/Eula_bench/Bug_example/Deadlock2.jar
add jar file: /media/vdc/software/Eula/Eula_bench/Bug_example/DeadLockProject103.jar
add jar file: /media/vdc/software/Eula/Eula_bench/Bug_example/DeadLockProject.jar
add jar file: /media/vdc/software/Eula/Eula_bench/Bug_example/Race1.jar
add jar file: /media/vdc/software/Eula/Eula_bench/Bug_example/DeadLockProject105.jar
add jar file: /media/vdc/software/Eula/Eula_bench/Bug_example/DeadLockVerify.jar
add jar file: /media/vdc/software/Eula/Eula_bench/Bug_example/DeadLockProject102.jar
add jar file: /media/vdc/software/Eula/Eula_bench/Bug_example/Race2.jar
add jar file: /media/vdc/software/Eula/Eula_bench/Bug_example/Deadlock1.jar
[CRLOG]: Main entries:
[CRLOG]: => zte.com.cn.DeadLock104.main([Ljava/lang/String;)V
[CRLOG]: => zte.com.cn.DeadLock102.main([Ljava/lang/String;)V
[CRLOG]: => zte.com.cn.Deadlock103.main([Ljava/lang/String;)V
[CRLOG]: => zte.com.cn.DeadLock101.main([Ljava/lang/String;)V
[CRLOG]: 
[CRLOG]: 
==========zte/com/cn/DeadLock104============
[CRLOG]: Pointer Analysis Time: 1.187s
[CRLOG]: Total Pointer Keys: 7228
[CRLOG]: Total Instance Keys: 372
[CRLOG]: Total Pointer Edges: 15528
[CRLOG]: Total Classes: 12842
[CRLOG]: 
[CRLOG]: No deadlock found on zte/com/cn/DeadLock104
[CRLOG]:   *** Detection Time: 1362ms
[CRLOG]: Pointer Analysis Time: 0.617s
[CRLOG]: Total Pointer Keys: 7228
[CRLOG]: Total Instance Keys: 372
[CRLOG]: Total Pointer Edges: 15528
[CRLOG]: Total Classes: 12842
[CRLOG]: 
[CRLOG]: No race found on zte/com/cn/DeadLock104
[CRLOG]:   *** Detection Time: 635ms
[CRLOG]: 
==========zte/com/cn/DeadLock102============
[CRLOG]: Pointer Analysis Time: 0.452s
[CRLOG]: Total Pointer Keys: 5661
[CRLOG]: Total Instance Keys: 313
[CRLOG]: Total Pointer Edges: 11876
[CRLOG]: Total Classes: 12842
[CRLOG]: 
DEBUG LOCK (a variable points to multiple locks): [SITE_IN_NODE{< Application, Lzte/com/cn/DeadLock102, main([Ljava/lang/String;)V >:Ljava/lang/Object
DEBUG LOCK (a variable points to multiple locks): [SITE_IN_NODE{< Application, Lzte/com/cn/DeadLock102, main([Ljava/lang/String;)V >:Ljava/lang/Object
DEBUG LOCK (a variable points to multiple locks): [SITE_IN_NODE{< Application, Lzte/com/cn/DeadLock102, main([Ljava/lang/String;)V >:Ljava/lang/Object
DEBUG LOCK (a variable points to multiple locks): [SITE_IN_NODE{< Application, Lzte/com/cn/DeadLock102, main([Ljava/lang/String;)V >:Ljava/lang/Object
DEBUG LOCK (a variable points to multiple locks): [SITE_IN_NODE{< Application, Lzte/com/cn/DeadLock102, main([Ljava/lang/String;)V >:Ljava/lang/Object
DEBUG LOCK (a variable points to multiple locks): [SITE_IN_NODE{< Application, Lzte/com/cn/DeadLock102, main([Ljava/lang/String;)V >:Ljava/lang/Object
DEBUG LOCK (a variable points to multiple locks): [SITE_IN_NODE{< Application, Lzte/com/cn/DeadLock102, main([Ljava/lang/String;)V >:Ljava/lang/Object
DEBUG LOCK (a variable points to multiple locks): [SITE_IN_NODE{< Application, Lzte/com/cn/DeadLock102, main([Ljava/lang/String;)V >:Ljava/lang/Object
DEBUG LOCK (a variable points to multiple locks): [SITE_IN_NODE{< Application, Lzte/com/cn/DeadLock102, main([Ljava/lang/String;)V >:Ljava/lang/Object
DEBUG LOCK (a variable points to multiple locks): [SITE_IN_NODE{< Application, Lzte/com/cn/DeadLock102, main([Ljava/lang/String;)V >:Ljava/lang/Object
DEBUG LOCK (a variable points to multiple locks): [SITE_IN_NODE{< Application, Lzte/com/cn/DeadLock102, main([Ljava/lang/String;)V >:Ljava/lang/Object
DEBUG LOCK (a variable points to multiple locks): [SITE_IN_NODE{< Application, Lzte/com/cn/DeadLock102, main([Ljava/lang/String;)V >:Ljava/lang/Object
[CRLOG]: No deadlock found on zte/com/cn/DeadLock102
[CRLOG]:   *** Detection Time: 472ms
[CRLOG]: Pointer Analysis Time: 0.382s
[CRLOG]: Total Pointer Keys: 5661
[CRLOG]: Total Instance Keys: 313
[CRLOG]: Total Pointer Edges: 11876
[CRLOG]: Total Classes: 12842
[CRLOG]: 
[CRLOG]: No race found on zte/com/cn/DeadLock102
[CRLOG]:   *** Detection Time: 386ms
[CRLOG]: 
==========zte/com/cn/Deadlock103============
[CRLOG]: Pointer Analysis Time: 0.387s
[CRLOG]: Total Pointer Keys: 5625
[CRLOG]: Total Instance Keys: 308
[CRLOG]: Total Pointer Edges: 11632
[CRLOG]: Total Classes: 12842
[CRLOG]: 
[CRLOG]: No deadlock found on zte/com/cn/Deadlock103
[CRLOG]:   *** Detection Time: 397ms
[CRLOG]: Pointer Analysis Time: 0.279s
[CRLOG]: Total Pointer Keys: 5625
[CRLOG]: Total Instance Keys: 308
[CRLOG]: Total Pointer Edges: 11632
[CRLOG]: Total Classes: 12842
[CRLOG]: 
[CRLOG]: No race found on zte/com/cn/Deadlock103
[CRLOG]:   *** Detection Time: 282ms
[CRLOG]: 
==========zte/com/cn/DeadLock101============
[CRLOG]: Pointer Analysis Time: 0.269s
[CRLOG]: Total Pointer Keys: 5685
[CRLOG]: Total Instance Keys: 323
[CRLOG]: Total Pointer Edges: 11817
[CRLOG]: Total Classes: 12842
[CRLOG]: 
[CRLOG]: No deadlock found on zte/com/cn/DeadLock101
[CRLOG]:   *** Detection Time: 285ms
[CRLOG]: Pointer Analysis Time: 0.216s
[CRLOG]: Total Pointer Keys: 5685
[CRLOG]: Total Instance Keys: 323
[CRLOG]: Total Pointer Edges: 11817
[CRLOG]: Total Classes: 12842
[CRLOG]: 
[CRLOG]: No race found on zte/com/cn/DeadLock101
[CRLOG]:   *** Detection Time: 218ms
SLF4J: A SLF4J service provider failed to instantiate:
org.slf4j.spi.SLF4JServiceProvider: Provider org.slf4j.simple.SimpleServiceProvider not found
SLF4J: No SLF4J providers were found.
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See https://www.slf4j.org/codes.html#noProviders for further details.
[CRLOG]: An index page is saved to <current path>/race-report/index.html
[CRLOG]: Main entries:
[CRLOG]: => zte.com.cn.DeadLock101.main([Ljava/lang/String;)V
[CRLOG]: 
[CRLOG]: 
==========zte/com/cn/DeadLock101============
[CRLOG]: Pointer Analysis Time: 0.526s
[CRLOG]: Total Pointer Keys: 5685
[CRLOG]: Total Instance Keys: 323
[CRLOG]: Total Pointer Edges: 11817
[CRLOG]: Total Classes: 12831
[CRLOG]: 
[CRLOG]: No deadlock found on zte/com/cn/DeadLock101
[CRLOG]:   *** Detection Time: 535ms
[CRLOG]: Pointer Analysis Time: 0.305s
[CRLOG]: Total Pointer Keys: 5685
[CRLOG]: Total Instance Keys: 323
[CRLOG]: Total Pointer Edges: 11817
[CRLOG]: Total Classes: 12831
[CRLOG]: 
[CRLOG]: No race found on zte/com/cn/DeadLock101
[CRLOG]:   *** Detection Time: 307ms
[CRLOG]: An index page is saved to <current path>/race-report/index.html
[CRLOG]: Main entries:
[CRLOG]: => Deadlock.main([Ljava/lang/String;)V
[CRLOG]: 
[CRLOG]: 
==========Deadlock============
[CRLOG]: Pointer Analysis Time: 0.28s
[CRLOG]: Total Pointer Keys: 5785
[CRLOG]: Total Instance Keys: 323
[CRLOG]: Total Pointer Edges: 11896
[CRLOG]: Total Classes: 12830
[CRLOG]: 
[CRLOG]: Total #Deadlocks: 1
[CRLOG]:   *** Detection Time: 288ms
[CRLOG]: Deadlock: 
[CRLOG]: Deadlock{lp1=DLLockPair{lock1=5 15 lock Ljava/lang/Object.1257760047, lock2=5 16 lock Ljava/lang/Object.1257760037}, lp2=DLLockPair{lock1=5 16 lock Ljava/lang/Object.1257760037, lock2=5 15 lock Ljava/lang/Object.1257760047}}
[CRLOG]: *********************************************************************************************
[CRLOG]: 
[CRLOG]: Pointer Analysis Time: 0.21s
[CRLOG]: Total Pointer Keys: 5785
[CRLOG]: Total Instance Keys: 323
[CRLOG]: Total Pointer Edges: 11896
[CRLOG]: Total Classes: 12830
[CRLOG]: 
[CRLOG]: No race found on Deadlock
[CRLOG]:   *** Detection Time: 212ms
[CRLOG]: An index page is saved to <current path>/race-report/index.html
[CRLOG]: Main entries:
[CRLOG]: => DeadlockTest.main([Ljava/lang/String;)V
[CRLOG]: 
[CRLOG]: 
==========DeadlockTest============
[CRLOG]: Pointer Analysis Time: 0.386s
[CRLOG]: Total Pointer Keys: 5740
[CRLOG]: Total Instance Keys: 323
[CRLOG]: Total Pointer Edges: 11842
[CRLOG]: Total Classes: 12831
[CRLOG]: 
[CRLOG]: Total #Deadlocks: 1
[CRLOG]:   *** Detection Time: 394ms
[CRLOG]: Deadlock: 
[CRLOG]: Deadlock{lp1=DLLockPair{lock1=4 15 lock Ljava/lang/String.-1941771399, lock2=4 16 lock Ljava/lang/String.-1941773276}, lp2=DLLockPair{lock1=4 16 lock Ljava/lang/String.-1941773276, lock2=4 15 lock Ljava/lang/String.-1941771399}}
[CRLOG]: *********************************************************************************************
[CRLOG]: 
[CRLOG]: Pointer Analysis Time: 0.269s
[CRLOG]: Total Pointer Keys: 5740
[CRLOG]: Total Instance Keys: 323
[CRLOG]: Total Pointer Edges: 11842
[CRLOG]: Total Classes: 12831
[CRLOG]: 
[CRLOG]: No race found on DeadlockTest
[CRLOG]:   *** Detection Time: 271ms
[CRLOG]: An index page is saved to <current path>/race-report/index.html
[CRLOG]: Main entries:
[CRLOG]: => zte.com.cn.DeadLock102.main([Ljava/lang/String;)V
[CRLOG]: => zte.com.cn.Deadlock103.main([Ljava/lang/String;)V
[CRLOG]: => zte.com.cn.DeadLock101.main([Ljava/lang/String;)V
[CRLOG]: 
[CRLOG]: 
==========zte/com/cn/DeadLock102============
[CRLOG]: Pointer Analysis Time: 0.349s
[CRLOG]: Total Pointer Keys: 5661
[CRLOG]: Total Instance Keys: 313
[CRLOG]: Total Pointer Edges: 11876
[CRLOG]: Total Classes: 12838
[CRLOG]: 
DEBUG LOCK (a variable points to multiple locks): [SITE_IN_NODE{< Application, Lzte/com/cn/DeadLock102, main([Ljava/lang/String;)V >:Ljava/lang/Object
DEBUG LOCK (a variable points to multiple locks): [SITE_IN_NODE{< Application, Lzte/com/cn/DeadLock102, main([Ljava/lang/String;)V >:Ljava/lang/Object
DEBUG LOCK (a variable points to multiple locks): [SITE_IN_NODE{< Application, Lzte/com/cn/DeadLock102, main([Ljava/lang/String;)V >:Ljava/lang/Object
DEBUG LOCK (a variable points to multiple locks): [SITE_IN_NODE{< Application, Lzte/com/cn/DeadLock102, main([Ljava/lang/String;)V >:Ljava/lang/Object
DEBUG LOCK (a variable points to multiple locks): [SITE_IN_NODE{< Application, Lzte/com/cn/DeadLock102, main([Ljava/lang/String;)V >:Ljava/lang/Object
DEBUG LOCK (a variable points to multiple locks): [SITE_IN_NODE{< Application, Lzte/com/cn/DeadLock102, main([Ljava/lang/String;)V >:Ljava/lang/Object
DEBUG LOCK (a variable points to multiple locks): [SITE_IN_NODE{< Application, Lzte/com/cn/DeadLock102, main([Ljava/lang/String;)V >:Ljava/lang/Object
DEBUG LOCK (a variable points to multiple locks): [SITE_IN_NODE{< Application, Lzte/com/cn/DeadLock102, main([Ljava/lang/String;)V >:Ljava/lang/Object
DEBUG LOCK (a variable points to multiple locks): [SITE_IN_NODE{< Application, Lzte/com/cn/DeadLock102, main([Ljava/lang/String;)V >:Ljava/lang/Object
DEBUG LOCK (a variable points to multiple locks): [SITE_IN_NODE{< Application, Lzte/com/cn/DeadLock102, main([Ljava/lang/String;)V >:Ljava/lang/Object
DEBUG LOCK (a variable points to multiple locks): [SITE_IN_NODE{< Application, Lzte/com/cn/DeadLock102, main([Ljava/lang/String;)V >:Ljava/lang/Object
DEBUG LOCK (a variable points to multiple locks): [SITE_IN_NODE{< Application, Lzte/com/cn/DeadLock102, main([Ljava/lang/String;)V >:Ljava/lang/Object
[CRLOG]: No deadlock found on zte/com/cn/DeadLock102
[CRLOG]:   *** Detection Time: 357ms
[CRLOG]: Pointer Analysis Time: 0.276s
[CRLOG]: Total Pointer Keys: 5661
[CRLOG]: Total Instance Keys: 313
[CRLOG]: Total Pointer Edges: 11876
[CRLOG]: Total Classes: 12838
[CRLOG]: 
[CRLOG]: No race found on zte/com/cn/DeadLock102
[CRLOG]:   *** Detection Time: 279ms
[CRLOG]: 
==========zte/com/cn/Deadlock103============
[CRLOG]: Pointer Analysis Time: 0.306s
[CRLOG]: Total Pointer Keys: 5625
[CRLOG]: Total Instance Keys: 308
[CRLOG]: Total Pointer Edges: 11632
[CRLOG]: Total Classes: 12838
[CRLOG]: 
[CRLOG]: No deadlock found on zte/com/cn/Deadlock103
[CRLOG]:   *** Detection Time: 315ms
[CRLOG]: Pointer Analysis Time: 0.276s
[CRLOG]: Total Pointer Keys: 5625
[CRLOG]: Total Instance Keys: 308
[CRLOG]: Total Pointer Edges: 11632
[CRLOG]: Total Classes: 12838
[CRLOG]: 
[CRLOG]: No race found on zte/com/cn/Deadlock103
[CRLOG]:   *** Detection Time: 279ms
[CRLOG]: 
==========zte/com/cn/DeadLock101============
[CRLOG]: Pointer Analysis Time: 0.265s
[CRLOG]: Total Pointer Keys: 5685
[CRLOG]: Total Instance Keys: 323
[CRLOG]: Total Pointer Edges: 11817
[CRLOG]: Total Classes: 12838
[CRLOG]: 
[CRLOG]: No deadlock found on zte/com/cn/DeadLock101
[CRLOG]:   *** Detection Time: 274ms
[CRLOG]: Pointer Analysis Time: 0.327s
[CRLOG]: Total Pointer Keys: 5685
[CRLOG]: Total Instance Keys: 323
[CRLOG]: Total Pointer Edges: 11817
[CRLOG]: Total Classes: 12838
[CRLOG]: 
[CRLOG]: No race found on zte/com/cn/DeadLock101
[CRLOG]:   *** Detection Time: 329ms
[CRLOG]: An index page is saved to <current path>/race-report/index.html
[CRLOG]: Main entries:
[CRLOG]: => zte.com.cn.DeadLock10222.main([Ljava/lang/String;)V
[CRLOG]: 
[CRLOG]: 
==========zte/com/cn/DeadLock10222============
[CRLOG]: Pointer Analysis Time: 0.313s
[CRLOG]: Total Pointer Keys: 5678
[CRLOG]: Total Instance Keys: 322
[CRLOG]: Total Pointer Edges: 11816
[CRLOG]: Total Classes: 12831
[CRLOG]: 
[CRLOG]: No deadlock found on zte/com/cn/DeadLock10222
[CRLOG]:   *** Detection Time: 320ms
[CRLOG]: Pointer Analysis Time: 0.239s
[CRLOG]: Total Pointer Keys: 5678
[CRLOG]: Total Instance Keys: 322
[CRLOG]: Total Pointer Edges: 11816
[CRLOG]: Total Classes: 12831
[CRLOG]: 
[CRLOG]: No race found on zte/com/cn/DeadLock10222
[CRLOG]:   *** Detection Time: 241ms
[CRLOG]: An index page is saved to <current path>/race-report/index.html
[CRLOG]: Main entries:
[CRLOG]: => Race.main([Ljava/lang/String;)V
[CRLOG]: 
[CRLOG]: 
==========Race============
[CRLOG]: Pointer Analysis Time: 0.294s
[CRLOG]: Total Pointer Keys: 6105
[CRLOG]: Total Instance Keys: 329
[CRLOG]: Total Pointer Edges: 13483
[CRLOG]: Total Classes: 12829
[CRLOG]: 
[CRLOG]: No deadlock found on Race
[CRLOG]:   *** Detection Time: 300ms
[CRLOG]: Pointer Analysis Time: 0.221s
[CRLOG]: Total Pointer Keys: 6105
[CRLOG]: Total Instance Keys: 329
[CRLOG]: Total Pointer Edges: 13483
[CRLOG]: Total Classes: 12829
[CRLOG]: 
[CRLOG]: Total #Races: 1  Total #Node Races1  *** Detection Time: 243ms
[CRLOG]: Report is saved to <current path>/race-report/Race.html
[CRLOG]: An index page is saved to <current path>/race-report/index.html
[CRLOG]: Main entries:
[CRLOG]: => zte.com.cn.DeadLock105.main([Ljava/lang/String;)V
[CRLOG]: => zte.com.cn.DeadLock104.main([Ljava/lang/String;)V
[CRLOG]: => zte.com.cn.DeadLock102.main([Ljava/lang/String;)V
[CRLOG]: => zte.com.cn.Deadlock103.main([Ljava/lang/String;)V
[CRLOG]: => zte.com.cn.DeadLock101.main([Ljava/lang/String;)V
[CRLOG]: 
[CRLOG]: 
==========zte/com/cn/DeadLock105============
[CRLOG]: Pointer Analysis Time: 0.22s
[CRLOG]: Total Pointer Keys: 5643
[CRLOG]: Total Instance Keys: 309
[CRLOG]: Total Pointer Edges: 11721
[CRLOG]: Total Classes: 12922
[CRLOG]: 
[CRLOG]: No deadlock found on zte/com/cn/DeadLock105
[CRLOG]:   *** Detection Time: 226ms
[CRLOG]: Pointer Analysis Time: 0.287s
[CRLOG]: Total Pointer Keys: 5643
[CRLOG]: Total Instance Keys: 309
[CRLOG]: Total Pointer Edges: 11721
[CRLOG]: Total Classes: 12922
[CRLOG]: 
[CRLOG]: No race found on zte/com/cn/DeadLock105
[CRLOG]:   *** Detection Time: 290ms
[CRLOG]: 
==========zte/com/cn/DeadLock104============
[CRLOG]: Pointer Analysis Time: 0.229s
[CRLOG]: Total Pointer Keys: 7228
[CRLOG]: Total Instance Keys: 372
[CRLOG]: Total Pointer Edges: 15528
[CRLOG]: Total Classes: 12922
[CRLOG]: 
[CRLOG]: No deadlock found on zte/com/cn/DeadLock104
[CRLOG]:   *** Detection Time: 234ms
[CRLOG]: Pointer Analysis Time: 0.283s
[CRLOG]: Total Pointer Keys: 7228
[CRLOG]: Total Instance Keys: 372
[CRLOG]: Total Pointer Edges: 15528
[CRLOG]: Total Classes: 12922
[CRLOG]: 
[CRLOG]: No race found on zte/com/cn/DeadLock104
[CRLOG]:   *** Detection Time: 284ms
[CRLOG]: 
==========zte/com/cn/DeadLock102============
[CRLOG]: Pointer Analysis Time: 0.184s
[CRLOG]: Total Pointer Keys: 5661
[CRLOG]: Total Instance Keys: 313
[CRLOG]: Total Pointer Edges: 11876
[CRLOG]: Total Classes: 12922
[CRLOG]: 
DEBUG LOCK (a variable points to multiple locks): [SITE_IN_NODE{< Application, Lzte/com/cn/DeadLock102, main([Ljava/lang/String;)V >:Ljava/lang/Object
DEBUG LOCK (a variable points to multiple locks): [SITE_IN_NODE{< Application, Lzte/com/cn/DeadLock102, main([Ljava/lang/String;)V >:Ljava/lang/Object
DEBUG LOCK (a variable points to multiple locks): [SITE_IN_NODE{< Application, Lzte/com/cn/DeadLock102, main([Ljava/lang/String;)V >:Ljava/lang/Object
DEBUG LOCK (a variable points to multiple locks): [SITE_IN_NODE{< Application, Lzte/com/cn/DeadLock102, main([Ljava/lang/String;)V >:Ljava/lang/Object
DEBUG LOCK (a variable points to multiple locks): [SITE_IN_NODE{< Application, Lzte/com/cn/DeadLock102, main([Ljava/lang/String;)V >:Ljava/lang/Object
DEBUG LOCK (a variable points to multiple locks): [SITE_IN_NODE{< Application, Lzte/com/cn/DeadLock102, main([Ljava/lang/String;)V >:Ljava/lang/Object
DEBUG LOCK (a variable points to multiple locks): [SITE_IN_NODE{< Application, Lzte/com/cn/DeadLock102, main([Ljava/lang/String;)V >:Ljava/lang/Object
DEBUG LOCK (a variable points to multiple locks): [SITE_IN_NODE{< Application, Lzte/com/cn/DeadLock102, main([Ljava/lang/String;)V >:Ljava/lang/Object
DEBUG LOCK (a variable points to multiple locks): [SITE_IN_NODE{< Application, Lzte/com/cn/DeadLock102, main([Ljava/lang/String;)V >:Ljava/lang/Object
DEBUG LOCK (a variable points to multiple locks): [SITE_IN_NODE{< Application, Lzte/com/cn/DeadLock102, main([Ljava/lang/String;)V >:Ljava/lang/Object
DEBUG LOCK (a variable points to multiple locks): [SITE_IN_NODE{< Application, Lzte/com/cn/DeadLock102, main([Ljava/lang/String;)V >:Ljava/lang/Object
DEBUG LOCK (a variable points to multiple locks): [SITE_IN_NODE{< Application, Lzte/com/cn/DeadLock102, main([Ljava/lang/String;)V >:Ljava/lang/Object
[CRLOG]: No deadlock found on zte/com/cn/DeadLock102
[CRLOG]:   *** Detection Time: 191ms
[CRLOG]: Pointer Analysis Time: 0.183s
[CRLOG]: Total Pointer Keys: 5661
[CRLOG]: Total Instance Keys: 313
[CRLOG]: Total Pointer Edges: 11876
[CRLOG]: Total Classes: 12922
[CRLOG]: 
[CRLOG]: No race found on zte/com/cn/DeadLock102
[CRLOG]:   *** Detection Time: 184ms
[CRLOG]: 
==========zte/com/cn/Deadlock103============
[CRLOG]: Pointer Analysis Time: 0.207s
[CRLOG]: Total Pointer Keys: 5625
[CRLOG]: Total Instance Keys: 308
[CRLOG]: Total Pointer Edges: 11632
[CRLOG]: Total Classes: 12922
[CRLOG]: 
[CRLOG]: No deadlock found on zte/com/cn/Deadlock103
[CRLOG]:   *** Detection Time: 213ms
[CRLOG]: Pointer Analysis Time: 0.23s
[CRLOG]: Total Pointer Keys: 5625
[CRLOG]: Total Instance Keys: 308
[CRLOG]: Total Pointer Edges: 11632
[CRLOG]: Total Classes: 12922
[CRLOG]: 
[CRLOG]: No race found on zte/com/cn/Deadlock103
[CRLOG]:   *** Detection Time: 232ms
[CRLOG]: 
==========zte/com/cn/DeadLock101============
[CRLOG]: Pointer Analysis Time: 0.187s
[CRLOG]: Total Pointer Keys: 5685
[CRLOG]: Total Instance Keys: 323
[CRLOG]: Total Pointer Edges: 11817
[CRLOG]: Total Classes: 12922
[CRLOG]: 
[CRLOG]: No deadlock found on zte/com/cn/DeadLock101
[CRLOG]:   *** Detection Time: 192ms
[CRLOG]: Pointer Analysis Time: 0.17s
[CRLOG]: Total Pointer Keys: 5685
[CRLOG]: Total Instance Keys: 323
[CRLOG]: Total Pointer Edges: 11817
[CRLOG]: Total Classes: 12922
[CRLOG]: 
[CRLOG]: No race found on zte/com/cn/DeadLock101
[CRLOG]:   *** Detection Time: 171ms
[CRLOG]: An index page is saved to <current path>/race-report/index.html
[CRLOG]: Main entries:
[CRLOG]: => zte.com.DieLock101.main([Ljava/lang/String;)V
[CRLOG]: 
[CRLOG]: 
==========zte/com/DieLock101============
[CRLOG]: Pointer Analysis Time: 0.254s
[CRLOG]: Total Pointer Keys: 5631
[CRLOG]: Total Instance Keys: 313
[CRLOG]: Total Pointer Edges: 11783
[CRLOG]: Total Classes: 12832
[CRLOG]: 
[CRLOG]: Total #Deadlocks: 8
[CRLOG]:   *** Detection Time: 262ms
[CRLOG]: Deadlock: 
[CRLOG]: Deadlock{lp1=DLLockPair{lock1=11 16 lock Ljava/lang/String.1219296501, lock2=4 16 lock Ljava/lang/String.-1845056356}, lp2=DLLockPair{lock1=4 16 lock Ljava/lang/String.-1845056356, lock2=11 16 lock Ljava/lang/String.1219296501}}
[CRLOG]: Deadlock{lp1=DLLockPair{lock1=4 16 lock Ljava/lang/String.-1845056356, lock2=11 16 lock Ljava/lang/String.1219296501}, lp2=DLLockPair{lock1=11 16 lock Ljava/lang/String.1219296501, lock2=4 16 lock Ljava/lang/String.-1845056356}}
[CRLOG]: Deadlock{lp1=DLLockPair{lock1=4 16 lock Ljava/lang/String.-1845056356, lock2=11 16 lock Ljava/lang/String.1219296501}, lp2=DLLockPair{lock1=11 16 lock Ljava/lang/String.1219296501, lock2=4 16 lock Ljava/lang/String.-1845056356}}
[CRLOG]: Deadlock{lp1=DLLockPair{lock1=11 16 lock Ljava/lang/String.1219296501, lock2=4 16 lock Ljava/lang/String.-1845056356}, lp2=DLLockPair{lock1=4 16 lock Ljava/lang/String.-1845056356, lock2=11 16 lock Ljava/lang/String.1219296501}}
[CRLOG]: Deadlock{lp1=DLLockPair{lock1=11 16 lock Ljava/lang/String.1219296501, lock2=4 16 lock Ljava/lang/String.-1845056356}, lp2=DLLockPair{lock1=4 16 lock Ljava/lang/String.-1845056356, lock2=11 16 lock Ljava/lang/String.1219296501}}
[CRLOG]: Deadlock{lp1=DLLockPair{lock1=4 16 lock Ljava/lang/String.-1845056356, lock2=11 16 lock Ljava/lang/String.1219296501}, lp2=DLLockPair{lock1=11 16 lock Ljava/lang/String.1219296501, lock2=4 16 lock Ljava/lang/String.-1845056356}}
[CRLOG]: Deadlock{lp1=DLLockPair{lock1=4 16 lock Ljava/lang/String.-1845056356, lock2=11 16 lock Ljava/lang/String.1219296501}, lp2=DLLockPair{lock1=11 16 lock Ljava/lang/String.1219296501, lock2=4 16 lock Ljava/lang/String.-1845056356}}
[CRLOG]: Deadlock{lp1=DLLockPair{lock1=11 16 lock Ljava/lang/String.1219296501, lock2=4 16 lock Ljava/lang/String.-1845056356}, lp2=DLLockPair{lock1=4 16 lock Ljava/lang/String.-1845056356, lock2=11 16 lock Ljava/lang/String.1219296501}}
[CRLOG]: *********************************************************************************************
[CRLOG]: 
[CRLOG]: Pointer Analysis Time: 0.2s
[CRLOG]: Total Pointer Keys: 5631
[CRLOG]: Total Instance Keys: 313
[CRLOG]: Total Pointer Edges: 11783
[CRLOG]: Total Classes: 12832
[CRLOG]: 
[CRLOG]: No race found on zte/com/DieLock101
[CRLOG]:   *** Detection Time: 201ms
[CRLOG]: An index page is saved to <current path>/race-report/index.html
[CRLOG]: Main entries:
[CRLOG]: => zte.com.cn.DeadLock102.main([Ljava/lang/String;)V
[CRLOG]: => zte.com.cn.DeadLock101.main([Ljava/lang/String;)V
[CRLOG]: 
[CRLOG]: 
==========zte/com/cn/DeadLock102============
[CRLOG]: Pointer Analysis Time: 0.207s
[CRLOG]: Total Pointer Keys: 5661
[CRLOG]: Total Instance Keys: 313
[CRLOG]: Total Pointer Edges: 11876
[CRLOG]: Total Classes: 12833
[CRLOG]: 
DEBUG LOCK (a variable points to multiple locks): [SITE_IN_NODE{< Application, Lzte/com/cn/DeadLock102, main([Ljava/lang/String;)V >:Ljava/lang/Object
DEBUG LOCK (a variable points to multiple locks): [SITE_IN_NODE{< Application, Lzte/com/cn/DeadLock102, main([Ljava/lang/String;)V >:Ljava/lang/Object
DEBUG LOCK (a variable points to multiple locks): [SITE_IN_NODE{< Application, Lzte/com/cn/DeadLock102, main([Ljava/lang/String;)V >:Ljava/lang/Object
DEBUG LOCK (a variable points to multiple locks): [SITE_IN_NODE{< Application, Lzte/com/cn/DeadLock102, main([Ljava/lang/String;)V >:Ljava/lang/Object
DEBUG LOCK (a variable points to multiple locks): [SITE_IN_NODE{< Application, Lzte/com/cn/DeadLock102, main([Ljava/lang/String;)V >:Ljava/lang/Object
DEBUG LOCK (a variable points to multiple locks): [SITE_IN_NODE{< Application, Lzte/com/cn/DeadLock102, main([Ljava/lang/String;)V >:Ljava/lang/Object
DEBUG LOCK (a variable points to multiple locks): [SITE_IN_NODE{< Application, Lzte/com/cn/DeadLock102, main([Ljava/lang/String;)V >:Ljava/lang/Object
DEBUG LOCK (a variable points to multiple locks): [SITE_IN_NODE{< Application, Lzte/com/cn/DeadLock102, main([Ljava/lang/String;)V >:Ljava/lang/Object
DEBUG LOCK (a variable points to multiple locks): [SITE_IN_NODE{< Application, Lzte/com/cn/DeadLock102, main([Ljava/lang/String;)V >:Ljava/lang/Object
DEBUG LOCK (a variable points to multiple locks): [SITE_IN_NODE{< Application, Lzte/com/cn/DeadLock102, main([Ljava/lang/String;)V >:Ljava/lang/Object
DEBUG LOCK (a variable points to multiple locks): [SITE_IN_NODE{< Application, Lzte/com/cn/DeadLock102, main([Ljava/lang/String;)V >:Ljava/lang/Object
DEBUG LOCK (a variable points to multiple locks): [SITE_IN_NODE{< Application, Lzte/com/cn/DeadLock102, main([Ljava/lang/String;)V >:Ljava/lang/Object
[CRLOG]: No deadlock found on zte/com/cn/DeadLock102
[CRLOG]:   *** Detection Time: 212ms
[CRLOG]: Pointer Analysis Time: 0.162s
[CRLOG]: Total Pointer Keys: 5661
[CRLOG]: Total Instance Keys: 313
[CRLOG]: Total Pointer Edges: 11876
[CRLOG]: Total Classes: 12833
[CRLOG]: 
[CRLOG]: No race found on zte/com/cn/DeadLock102
[CRLOG]:   *** Detection Time: 164ms
[CRLOG]: 
==========zte/com/cn/DeadLock101============
[CRLOG]: Pointer Analysis Time: 0.26s
[CRLOG]: Total Pointer Keys: 5685
[CRLOG]: Total Instance Keys: 323
[CRLOG]: Total Pointer Edges: 11817
[CRLOG]: Total Classes: 12833
[CRLOG]: 
[CRLOG]: No deadlock found on zte/com/cn/DeadLock101
[CRLOG]:   *** Detection Time: 267ms
[CRLOG]: Pointer Analysis Time: 0.168s
[CRLOG]: Total Pointer Keys: 5685
[CRLOG]: Total Instance Keys: 323
[CRLOG]: Total Pointer Edges: 11817
[CRLOG]: Total Classes: 12833
[CRLOG]: 
[CRLOG]: No race found on zte/com/cn/DeadLock101
[CRLOG]:   *** Detection Time: 169ms
[CRLOG]: An index page is saved to <current path>/race-report/index.html
[CRLOG]: Main entries:
[CRLOG]: => Race.main([Ljava/lang/String;)V
[CRLOG]: 
[CRLOG]: 
==========Race============
[CRLOG]: Pointer Analysis Time: 0.208s
[CRLOG]: Total Pointer Keys: 5583
[CRLOG]: Total Instance Keys: 306
[CRLOG]: Total Pointer Edges: 11633
[CRLOG]: Total Classes: 12830
[CRLOG]: 
[CRLOG]: No deadlock found on Race
[CRLOG]:   *** Detection Time: 212ms
[CRLOG]: Pointer Analysis Time: 0.176s
[CRLOG]: Total Pointer Keys: 5583
[CRLOG]: Total Instance Keys: 306
[CRLOG]: Total Pointer Edges: 11633
[CRLOG]: Total Classes: 12830
[CRLOG]: 
[CRLOG]: Total #Races: 2  Total #Node Races5  *** Detection Time: 179ms
[CRLOG]: Report is saved to <current path>/race-report/Race.html
[CRLOG]: An index page is saved to <current path>/race-report/index.html
[CRLOG]: Main entries:
[CRLOG]: => Deadlock.main([Ljava/lang/String;)V
[CRLOG]: 
[CRLOG]: 
==========Deadlock============
[CRLOG]: Pointer Analysis Time: 0.194s
[CRLOG]: Total Pointer Keys: 5777
[CRLOG]: Total Instance Keys: 323
[CRLOG]: Total Pointer Edges: 11890
[CRLOG]: Total Classes: 12830
[CRLOG]: 
[CRLOG]: Total #Deadlocks: 1
[CRLOG]:   *** Detection Time: 198ms
[CRLOG]: Deadlock: 
[CRLOG]: Deadlock{lp1=DLLockPair{lock1=3 15 lock Ljava/lang/Object.1257760047, lock2=3 16 lock Ljava/lang/Object.1257760037}, lp2=DLLockPair{lock1=3 16 lock Ljava/lang/Object.1257760037, lock2=3 15 lock Ljava/lang/Object.1257760047}}
[CRLOG]: *********************************************************************************************
[CRLOG]: 
[CRLOG]: Pointer Analysis Time: 0.19s
[CRLOG]: Total Pointer Keys: 5777
[CRLOG]: Total Instance Keys: 323
[CRLOG]: Total Pointer Edges: 11890
[CRLOG]: Total Classes: 12830
[CRLOG]: 
[CRLOG]: No race found on Deadlock
[CRLOG]:   *** Detection Time: 191ms
[CRLOG]: An index page is saved to <current path>/race-report/index.html
[root@LIN-3580BCC1C73 Eula]# 
