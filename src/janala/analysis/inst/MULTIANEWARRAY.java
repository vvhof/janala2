/*
 * Author: Koushik Sen (ksen@cs.berkeley.edu)
 */

package janala.analysis.inst;

public class MULTIANEWARRAY extends Instruction {
    String desc;
    int dims;

    public MULTIANEWARRAY(int iid, int mid, String desc, int dims) {
        super(iid, mid);
        this.desc = desc;
        this.dims = dims;
    }

    public void visit(IVisitor visitor) {
	visitor.visitMULTIANEWARRAY(this);
    }

    @Override
    public String toString() {
        return "MULTIANEWARRAY iid="+iid+" mid="+mid+" desc="+desc+" dims="+dims;
    }
}
