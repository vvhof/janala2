/*
 * Author: Koushik Sen (ksen@cs.berkeley.edu)
 */

package janala.instrument;

import org.objectweb.asm.ClassAdapter;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

public class SnoopInstructionClassAdapter extends ClassAdapter {
    public SnoopInstructionClassAdapter(ClassVisitor cv) {
        super(cv);
    }

    public MethodVisitor visitMethod(int access, String name, String desc, String signature, String[] exceptions) {
        System.out.println("<**************** "+name+" desc "+desc);
        MethodVisitor mv = cv.visitMethod(access, name, desc, signature, exceptions);
        if (mv != null) {
            System.out.println("******************* "+((access & Opcodes.ACC_STATIC)>0));
            mv = new SnoopInstructionMethodAdapter(mv,(access & Opcodes.ACC_STATIC)>0);
        }
        System.out.println("****************> "+name);

        return mv;
    }
}
