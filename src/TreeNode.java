import java.util.ArrayList;
import java.util.List;

public class TreeNode<Element> {

    private Element data;
    private TreeNode<Element> parent;
    private List<TreeNode<Element>> children =  new ArrayList<>();

    public TreeNode(Element data){
        this.data = data;
    }

    public TreeNode<Element> addChild(TreeNode<Element> child){
        child.setParent(this);
        this.children.add(child);
        return child;
    }

    public void addChildren(List<TreeNode<Element>> children){
        this.children.addAll(children);
    }

    public void setParent(TreeNode<Element> child){
        this.parent = child;
    }

    public TreeNode<Element> getParent(){
        return this.parent;
    }

    public void setChildren(List<TreeNode<Element>> newChildren){
        this.children = newChildren;
    }

    public List<TreeNode<Element>> getChildren(){
        return this.children;
    }

    public void setData(Element data){
        this.data = data;
    }

    public Element getData(){
        return this.data;
    }
}
