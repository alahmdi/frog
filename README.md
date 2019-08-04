## Frog | 人工生命 
这是一个人工生命试验项目，最终目标是创建“有自我意识表现”的模拟生命体，技术架构基于02年提出的 [一个人工脑模型](一个人工脑模型.md)。
这个项目永远没有结束的时候，开始于模拟一个简单的生命体，然后是青蛙、狗......, 结束于有“自我意识表现”的人工脑，或者说，结束于被机器人代替人类的那一天。  

## 缘起 | Origin
目前人工智能的进展已经比较完美地解决了模式识别这块的难题，人脸识别、语音识别已经不弱于人类的水平，而这是我在二十年前感到最困惑的一块，因为底子差和当时的电脑速度慢。模式识别解决了，剩下的问题就简单多了，目前距离人工意识的诞生只差临门一脚了，就是如何在识别的基础上“理解”这些识别的内容并与人类形成交互的反馈。所以这个项目的重点不在于模式识别，而是在利用模式识别的成果基础上，训练神经网络形成条件反射，表现出高等动物才具有的条形反射行为，最终表现为"拥有自我意识"的行为。根据“意识不是一种存在，而是一种现象”原理，如果最终一个系统表现出具有自我意识的行为，即可认为它也是人，应该获得人权。目前有些人工智能的研究目的是想让人工智能解决一些复杂的人类社会方面的问题如机器翻译等，则是完全错误的目标，不可能成功，因为如果一个系统不能表现出自我意识，它就不能与人类交流，也就不可能具有解决这些问题的能力，表现出来的现象就是通常说的"机器不犯错，一旦犯错就是大错"。另一方面，如果一个系统表现出具有自我意识的行为，它就完全有能力解决世界上所有难题，包括改进它的自身和淘汰人类(因为他是先进生产力的代表）。所以人工智能的研究重点应该放在人工生命的构建和论理研究，而不是期待短期收益，指望人类可以一直享受人工智能的大餐是很危险的。模式识别和深度学习的成果只是人工生命的踮脚石和一块路标而已。人工智能的“有用”的应用，很可能只是短暂的一段过渡期而已，不用高兴得太早，也许都是白忙，给机器人作嫁衣而已，当然，深度学习的成果在将来还是有用的，生物体从来不能象计算机那样对某个技能反复训练上千万次，达到史无前例的覆盖度，既使在机器人时代，也是一个有用的技术。  
简单来说，这个项目的目的是试验和探索神经网络开发的另一个方向，即以实验为导向，模拟生命进化的过程，按照优胜夯汰、随机变异、用进废退这三大原则,一步一步地搭建出从低等到复杂的人工生命体，除了模式识别的成果可以部分引用，原则上不需要很多的数学知识，因为它是由实验为驱动，而不是由算法着手来搭建神经网络。目前神经网络研究重点在于模式识别和算法，但对系统赋予主动性关注不够。

从单细胞进化到多细胞、从青蛙进化到人类，这是一个漫长的、随机的进化过程，但在超级电脑上跑可能只要几天时间，就可能得到一个相当不错的脑模型。当然电脑速度越快、容量越大、环境模拟的越真实，则优胜夯汰后形成的脑结构就越复杂，错的脑模型都被自然淘汰掉了。从算法着手搭建，还是从模拟环境着手自动进化，这是创建人工生命的两个大方向，第一个方向有可能走到死胡同里，因为它不具备算法自改进、变异、遗传(算法的压缩)功能，当脑模型复杂到一定地步，可能会超出人脑能理解的范畴。模拟环境方式的难点则在于环境本身必须足够复杂、正确。而且必须循序渐进，与脑的进化同步，如果把一群青蛙扔到猴子的模拟环境中，则所有青蛙都会被自然淘汰掉，项目就无法进行下去了，另一个困难是电脑必须非常快，因为它是用串行方式模拟并行，不断试错前进的过程。   目前的项目只是搭建了一个框架，语言为Java，利用Swing作图环境，构建一个虚拟环境、并模拟一群草履虫的优胜夯汰，来获取一个具备自进化功能的人工生命体，具体脑(即电脑生成的神经网络)的生成、进化算法还需要以后逐渐加入。欢迎有对神经网络感兴趣的同学加入这个实验项目，大家一起来玩，这个项目不需要多少数学知识，重在实践。  

## 短期目标 | Sort-term Goals  
目前它的第一个初步目标是：造出一个真正意义上的人工生命：草履虫(备注：基本上已完成)。它必须具备以下前四个特点：   
* 脑结构由电脑生成：神经网络由电脑算法生成，但是电脑算法仅限于模拟环境，而不是直接参与搭建神经网络，就好象大自然只负责拍死不合格的生命，它从不主动参与设计大脑。  
* 脑结构可遗传：类似于生物的DNA，电脑生成的脑结构(神经网络)，可通过简单的算法规则描述，并且此算法规则可以压缩成较短的片段存储，并参与到下一代草履虫的构建。  
* 脑结构可变异：算法规则可以变异，下一代生成的草履虫在脑结构上与上一代总体相似，但存在部分变异。  
* 适应环境：草履虫能够在模拟的虚拟环境下存活下来，环境有微小的变化，能够自适应环境，并一代代生存将适应这种环境的能力遗传下来。  
* 用进废退：这是一个假想，对于生物来说，存在这样一种现象，就是用的多的器官，容易发生变异（例如经常嚼槟榔，容易发生口腔癌变）,有理由相信这不是偶然现象，而是生物在进化过程中的一个有用的功能，以便于更快地变异，以适应环境，并很可能这种变异会通过遗传细胞影响到下一代。  

## 理论 | Theory  
为什么明明是个电脑程序，只要满足上述前四个特点就可以称之为"真正"的人工生命? 这一点我不想多说，大家可以百度一下"zhangrex 人工生命"就知道我的观点了：意识从来就不存在，意识只是一种现象。风吹、树动和风吹、添衣，都只是现象而已，意识本质上是一种现象，换句话说，只要表现出生命现象的事物，就可以称其为生命了，不管它是高等还是低等，不管它的物质存在基础是怎样的。二十年前我就开始思考这个问题，提出了“我思我不在”的口号，请仔细考虑一下这个观点，哲学上、理论上对智能、意识的研究是很无聊的，相当于在研究“无”到底是什么，不必多纠缠在理论和算法上。是的，用模拟环境得到的人工神经网络模型，我们确实无法掌控它的算法是怎样生成的，但是我们知道，这符合大自然创造生命的规律。

## 项目架构 | Architecture 
这是一个Java项目，分为Application、Env、Frog三个模块: 
Application模块: 用于项目的启动、关闭等基础服务，Windows环境下可以用run.bat来启动它查看演示。  
Env模块: 模拟一个生物生存区，用不同形状的图形点阵来表达和模拟食物、天敌、障碍等物体，这个虚拟空间由程序员全权控制，将随着Frog的脑进化而不断变得越来越复杂。  
Frog: 这是人工生命的主体，目前起名叫青蛙(Frog)，其实叫什么都一样。它主要具备以下器官：
* 运动器官: 与运动神经元相连，只有4个动作：上下左右。
* 进食器官：当Frog与食物的坐标重合时，食物会被从Env中删除，并相应增加Frog的能量值，并激活Frog的进食感觉神经元，随时间流逝能量将减少，能量耗尽则Frog死亡。  
* 视觉器官: 这是脑模型的一部分，在实验中先固定随意取脑内一片神经元区作为视觉区。    
* 脑器官: 这即是程序员要解决的问题，也是我们要获取的最终目标。脑模型的生成由电脑优胜夯汰、循环迭代进化生成，但这个进化的算法还是必须由程序员来掌控，一步步探索出来，即要防止虚拟环境太复杂，也要避免脑模型不适应环境，生命体全部被淘汰，导致实验中断，无法进行下去。     
	
## 技术细节和构思
* 通过数组来模拟神经网络，用串行的循环来模拟并行芯片运作方式。用Frog的能量多少来衡量是否将它淘汰还是允许它产生后代(下蛋)参与下一轮的测试，因为这个项目的目的是获取智能体，与一般的生命游戏还是有区别的，并不是适者生存就结束了，而是必须完成一系列程序员设定好的目标，一步步进化，直到表现出自我意识现象为止。脑模型的生成算法通过简单的神经元连接完成，原则上不允行出现任何形式的硬编码(除模式识别外)，因为硬编码可能会破坏“随机变异”这一生命特性。为简单起见，暂不考虑引入GPU图形芯片进行加速。
* 更多的杂乱的一些想法和构思放在“开发思路.md”、“一个人工脑模型.md”等文里。  

## 项目要实现的短期和长远目标  
* 脑模型和虚拟环境的初步搭建 [脑模型刚开始搭建。虚拟环境已完成，点击run.bat可以查看演示]
* 使脑模型具有视觉功能,如果有食物在它附近，将激发天生条件反射，向食物移动，并获得进食奖励 [未全部完成]
* 引入现成的图像识别算法，使脑模型具有图像识别功能，根据形状区分食物、毒物、天敌 [未完成]
* 如果误食有毒食物，将激发天生条件反射，获得惩罚并扣除能量，天生痛觉区兴奋。[未完成]
* 如果被天敌攻击，将激发天生条件反射，获得惩罚并扣除能量,天生痛觉区强烈兴奋。[未完成]
* 训练它将打击行为与痛觉兴奋区发生关联。[未完成]
* 训练它将看到“打”这个文字，与打击行为和痛觉兴奋区建立即系。[未完成]
* 训练它背下这100个字中所有汉字可能组成的常用词组，给它一个字，所有与这个字相关的词组细胞区兴奋。[未完成]
* 训练它一看到“食物来了”文字，就从窝里出来找吃的。[未完成]
* 训练它理解“你”，“我”、“他”文字，只针对“我”相关的指令作出反应。[未完成]
* 训练它认识数字，会做四则运算[未完成]
* 训练它认识圆、矩形、会计算面积,学会估算和判断"大"和"小"[未完成]
* 训练它认识坐标和时间，并按指令行动，如看到"你在9点走到右上角去，等三分钟后再回来"，将遵从指令行动。[未完成]

## 最终目标
* 扩大它的输入网格和输出网格规模，扩大神经元数量，
* 移殖到超级电脑上，由人来同它交流，输入新的图形和汉字，纠正它说的错误的话  
* 移殖到并行芯片硬件上  

## 目前进展和成绩  
2019.03.11 虚拟环境已建好，可以模拟低等生命的遗传、繁殖、变异、进化现象，但只能往一个方向运动，相当于一个最简单的单细胞生物，还不具备视觉能力，不具备主动找食能力。   
运行run.bat可以查看演示（需要安装Java8和Maven）。  
![result1](https://gitee.com/drinkjava2/frog/raw/master/result1.gif)   
另外每步演示的结果(egg)会存盘在根目根目录下，名为egg.ser，可以删除这个文件以从头开始新的测试。因为还没涉及脑模型的搭建，可以看到有些青蛙跑得飞快，这是自然选择的结果，因为跑在最前面的吃得多。   
一些重要的测试参数如显示区大小、是否每次测试要删除保存的蛋等，请参见Env.java中开头的常量设定，可以手工修改进行不同参数的测试。  
2019.03.21 添加了脑图，改进随机运动模式为Hungry区驱动。从脑图上可以直观地观察脑结构，方便调试。  
2019.04.01 改进脑图的显示bug, 每一次生成Frog时添加随机神经元，并简单实现"卵+精子->受精卵"算法，以促进种群多样性。  
2019-04-12 添加一个简单的眼睛(只有四个感光细胞)，自然选择的结果是眼睛被选中，但是和运动区短路了，谈不上智能。但有眼睛后找食效率明显提高了,见下图：  
![resut2](https://gitee.com/drinkjava2/frog/raw/master/result2.gif)   
2019-06-13 做了一些重构清理，加上了Happy和Pain两个器官，分别对应进食奖励和痛苦感，后者在靠近边界时激发。观查它的表现，痛苦感生效了，一些Frog跑到边界后就不再前进，而是顺着边界溜下去了，但是Happy器官没有生效，这也很显然，因为Happy属于复杂的进食条件反射链的一部分，在没有记忆器官（算法）引入之前，再怎么优胜劣汰也是没办法用上进食奖励信号的。见下图：  
![resut3](https://gitee.com/drinkjava2/frog/raw/master/result3.gif)    
2019-06-26 找食效率太低，又改回到4.12的用连接数量代替权值这个逻辑，人为设计的算法居然比不过随机连接。Pain器官的加入没有提高找食效率，必须与感光细胞合用才能知道是哪个边界，急需引入记忆功能。  
2019-06-28  为了让青蛙看到边界，又加了个新的眼睛，它是一个可自进化的nxn点阵的眼睛，将来会取代只有四个象素点(但能看得远)的老眼睛。到目前为止，依然还没有进行模式识别和记忆功能开发。另外脑图可以动态显示了，用一个红圈标记出被动态跟踪显示的青蛙。  
2019-07-28  
有以下改动：1.在Env区中间加了一个陷阱区Trap，以增加趣味性，自然选择的结果是青蛙会自动绕开陷阱区。2.增加一个Active器官，它的作用是一直保持激活，发现比Hungry器官驱动更能提高找食效率。3.增加一个Chance器官,它的作用是引入随机扰动，打破青蛙有时候围着一个食物打转就是吃不着的死循环。目前进食奖励信号没用到，白白浪费了。  
另外Chance和Eye类里也再次运用了随机试错原理去确定关键参数，效果还不错，有兴趣的可以看一看源码。  
![resut4](https://gitee.com/drinkjava2/frog/raw/master/result4.gif)   

另外发现青蛙其实是有记忆能力的，因为连接本身就是一种记忆，只不过它没有复杂的模式识别能力，例如给个蛇的图片它就认不出来。以后的工作将以模式识别为重点(当然随机连接看起来很有用，以后还可能保留)，基本原理是见note中提到的仿照波传播及全息存储原理，在思维区逆向成像。而且脑可能改成三维结构，并根据逆向成像原理，要将所有输入输出器官全移到三维结构的同一侧(即思维区)。这将会是一个非常大的改动，下面我简单画了一个3D示意图来说明我想象中的这个模式识别和记忆的原理，至于对不对还需要实验来验证:  
![3d-model](https://gitee.com/drinkjava2/frog/raw/master/3d-model.gif)  
这个模型的最顶层表示眼睛的感光细胞(或任意输入输出细胞)，同时也是思维区，红色表示一个长条的图形，兰色表示一个三角图形，如果这两个图形经常有规律地同时出现，就会把它们共有的节点撑大，见紫色的节点，当红色图形单独出现，就会强烈激活紫色节点，然后紫色节点的信号反向传播，就会激活三角图形，反之亦然。这就同时解释了模式识别和记忆(或者说回忆)功能的的原理。一个节点可以被多个感光细胞共享，所以它的存储能力是很强的。而且可能这个原理比较符合生物脑结构。当然，实际编程时，虚拟神经元不一定要排成正立方三角，而可能通过胡乱排放，大致上过得去就行了，也许能乱拳打死老师傅，最终要靠电脑自动随机的排放，然后用优胜劣汰来筛选。目前有个难点是这个记忆功能在思维区成像是如何有条不紊地大体上按串行进行工作的，这个问题先放一放。  
2019-08-04 更新了一个分组测试功能，如果测试青蛙数量太多，可以分批来测试，每轮测试最少的青蛙数量可以少到只有一个,这是用时间来换空间。  

## 版权 | License  
[Apache 2.0](http://www.apache.org/licenses/LICENSE-2.0)  

## 期望 | Futures
欢迎发issue、私信等方式提出建议或加入开发组。 
另外本项目开启了哭穷模式，比提交一个pull request还能帮助这个项目开发的，莫过于提交一个红包了，金钱就是时间，您的捐助将只会用于回馈本项目的实际参与开发者。     

## 作者其它开源项目 | Other Projects
- [Java持久层工具 jSqlBox](https://gitee.com/drinkjava2/jSqlBox)   
- [微型IOC/AOP工具 jBeanBox](https://gitee.com/drinkjava2/jBeanBox)  
- [前端写SQL工具 GoSqlGo](https://gitee.com/drinkjava2/gosqlgo)   
- [MyBatis增强插件 MyFatFat](https://gitee.com/drinkjava2/myfatfat)   

## 关注我 | About Me
[Github](https://github.com/drinkjava2)  
[码云](https://gitee.com/drinkjava2)   
微信:yong99819981(如想长期关注本项目、交流信息，或想参与具体开发的，请留言加"人工生命群"，如果只是想临时私聊也可加我好友后再删掉，我不介意)  