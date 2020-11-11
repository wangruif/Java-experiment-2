# Java-experiment-2
# 北石化 实验二
## 1.实验内容
- 1.基本要求： 完成教材P110的第四题关于pc、cpu、及其他模拟的程序。
- 2.附加要求：
 1. 类中定义不少于两个构造方法；
 2. 每个类定义不少于两个属性，且属性的类型应该多样化；
 3. 根据课堂中关于访问权限的内容，尝试定义属性的修饰符多样化，类中定义方法操作属性，避免直接通过“类对象.属性”的形式访问属性值；且定义的方法内应该有符合常理的逻辑判断
 4. 尝试把本次实验的多个类放置在不同的包中，体会修饰符private的用法。
 ## 2.实验设计
1.设置硬盘对象，给硬盘对象设置speed、amount方法。设置speed、amount方法在硬盘对象外不可访问(其他对象通用)
```
class harddisk {
    private int amount;
    private int speed;
```
### 核心方法

```
1. void setCpu(cpu cpu){
        this.cpu = cpu;
    }
    void setharddisk(harddisk hd){
        this.hd = hd;
    }
```
```
2. cpu cpu = new cpu();
        harddisk hd = new harddisk();
```
## 3.实验结果
```
cpu's speed is 2200
this's cpu name is AMD 
harddisk's capacity is 200
harddisk's speed was 5400
```
## 4.实验感想
1. 通过这次实验学习到了public,private,default的不同
2. 练习了使用IntelliJ IDEA
3. 学习了Markdown语法
4. 学习了GitHub的用法
