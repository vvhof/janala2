/*
 * Author: Koushik Sen (ksen@cs.berkeley.edu)
 */

package janala.analysis.inst;

public class ALOAD extends Instruction {
    int var;

    public ALOAD(int iid, int mid, int var) {
        super(iid, mid);
        this.var = var;
    }

    public void visit(IVisitor visitor) {
	visitor.visitALOAD(this);
    }

    @Override
    public String toString() {
        return "ALOAD iid="+iid+" mid="+mid+" var="+var;
    }
}
