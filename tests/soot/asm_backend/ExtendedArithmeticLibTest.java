package soot.asm_backend;

import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.util.TraceClassVisitor;

/**
 * Test for more arithmetic bytecode instructions
 *
 * @author Tobias Hamann, Florian Kuebler, Dominik Helm, Lukas Sommer
 *
 */
public class ExtendedArithmeticLibTest extends AbstractASMBackendTest {

	@Override
	protected void generate(TraceClassVisitor cw) {
		MethodVisitor mv;
		FieldVisitor fv;

		cw.visit(V1_1, ACC_PUBLIC + ACC_SUPER, "pkg/ExtendedArithmeticLib",
				null, "java/lang/Object", null);
		cw.visitSource("ExtendedArithmeticLib.java", null);
		{
			fv = cw.visitField(ACC_PRIVATE, "i1", "I", null, null);
			fv.visitEnd();
		}
		{
			fv = cw.visitField(ACC_PRIVATE, "f1", "F", null, null);
			fv.visitEnd();
		}
		{
			fv = cw.visitField(ACC_PRIVATE, "l1", "J", null, null);
			fv.visitEnd();
		}
		{
			fv = cw.visitField(ACC_PRIVATE, "d1", "D", null, null);
			fv.visitEnd();
		}
		{
			fv = cw.visitField(ACC_PRIVATE, "s1", "S", null, null);
			fv.visitEnd();
		}
		{
			fv = cw.visitField(ACC_PRIVATE, "b1", "B", null, null);
			fv.visitEnd();
		}
		{
			fv = cw.visitField(ACC_PRIVATE, "i2", "I", null, null);
			fv.visitEnd();
		}
		{
			fv = cw.visitField(ACC_PRIVATE, "f2", "F", null, null);
			fv.visitEnd();
		}
		{
			fv = cw.visitField(ACC_PRIVATE, "l2", "J", null, null);
			fv.visitEnd();
		}
		{
			fv = cw.visitField(ACC_PRIVATE, "d2", "D", null, null);
			fv.visitEnd();
		}
		{
			fv = cw.visitField(ACC_PRIVATE, "i3", "I", null, null);
			fv.visitEnd();
		}
		{
			fv = cw.visitField(ACC_PRIVATE, "f3", "F", null, null);
			fv.visitEnd();
		}
		{
			fv = cw.visitField(ACC_PRIVATE, "l3", "J", null, null);
			fv.visitEnd();
		}
		{
			fv = cw.visitField(ACC_PRIVATE, "d3", "D", null, null);
			fv.visitEnd();
		}
		{
			mv = cw.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
			mv.visitCode();
			mv.visitVarInsn(ALOAD, 0);
			mv.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>",
					"()V", false);
			mv.visitInsn(RETURN);
			mv.visitMaxs(0, 0);
			mv.visitEnd();
		}
		{
			mv = cw.visitMethod(ACC_PUBLIC, "doMod", "()V", null, null);
			mv.visitCode();
			mv.visitVarInsn(ALOAD, 0);
			mv.visitVarInsn(ALOAD, 0);
			mv.visitFieldInsn(GETFIELD, "pkg/ExtendedArithmeticLib", "i2", "I");
			mv.visitVarInsn(ALOAD, 0);
			mv.visitFieldInsn(GETFIELD, "pkg/ExtendedArithmeticLib", "i3", "I");
			mv.visitInsn(IREM);
			mv.visitFieldInsn(PUTFIELD, "pkg/ExtendedArithmeticLib", "i1", "I");
			mv.visitVarInsn(ALOAD, 0);
			mv.visitVarInsn(ALOAD, 0);
			mv.visitFieldInsn(GETFIELD, "pkg/ExtendedArithmeticLib", "f2", "F");
			mv.visitVarInsn(ALOAD, 0);
			mv.visitFieldInsn(GETFIELD, "pkg/ExtendedArithmeticLib", "f3", "F");
			mv.visitInsn(FREM);
			mv.visitFieldInsn(PUTFIELD, "pkg/ExtendedArithmeticLib", "f1", "F");
			mv.visitVarInsn(ALOAD, 0);
			mv.visitVarInsn(ALOAD, 0);
			mv.visitFieldInsn(GETFIELD, "pkg/ExtendedArithmeticLib", "l2", "J");
			mv.visitVarInsn(ALOAD, 0);
			mv.visitFieldInsn(GETFIELD, "pkg/ExtendedArithmeticLib", "l3", "J");
			mv.visitInsn(LREM);
			mv.visitFieldInsn(PUTFIELD, "pkg/ExtendedArithmeticLib", "l1", "J");
			mv.visitVarInsn(ALOAD, 0);
			mv.visitVarInsn(ALOAD, 0);
			mv.visitFieldInsn(GETFIELD, "pkg/ExtendedArithmeticLib", "d2", "D");
			mv.visitVarInsn(ALOAD, 0);
			mv.visitFieldInsn(GETFIELD, "pkg/ExtendedArithmeticLib", "d3", "D");
			mv.visitInsn(DREM);
			mv.visitFieldInsn(PUTFIELD, "pkg/ExtendedArithmeticLib", "d1", "D");
			mv.visitInsn(RETURN);
			mv.visitMaxs(0, 0);
			mv.visitEnd();
		}
		{
			mv = cw.visitMethod(ACC_PUBLIC, "doSub", "()V", null, null);
			mv.visitCode();
			mv.visitVarInsn(ALOAD, 0);
			mv.visitVarInsn(ALOAD, 0);
			mv.visitFieldInsn(GETFIELD, "pkg/ExtendedArithmeticLib", "i2", "I");
			mv.visitVarInsn(ALOAD, 0);
			mv.visitFieldInsn(GETFIELD, "pkg/ExtendedArithmeticLib", "i3", "I");
			mv.visitInsn(ISUB);
			mv.visitFieldInsn(PUTFIELD, "pkg/ExtendedArithmeticLib", "i1", "I");
			mv.visitVarInsn(ALOAD, 0);
			mv.visitVarInsn(ALOAD, 0);
			mv.visitFieldInsn(GETFIELD, "pkg/ExtendedArithmeticLib", "f2", "F");
			mv.visitVarInsn(ALOAD, 0);
			mv.visitFieldInsn(GETFIELD, "pkg/ExtendedArithmeticLib", "f3", "F");
			mv.visitInsn(FSUB);
			mv.visitFieldInsn(PUTFIELD, "pkg/ExtendedArithmeticLib", "f1", "F");
			mv.visitVarInsn(ALOAD, 0);
			mv.visitVarInsn(ALOAD, 0);
			mv.visitFieldInsn(GETFIELD, "pkg/ExtendedArithmeticLib", "l2", "J");
			mv.visitVarInsn(ALOAD, 0);
			mv.visitFieldInsn(GETFIELD, "pkg/ExtendedArithmeticLib", "l3", "J");
			mv.visitInsn(LSUB);
			mv.visitFieldInsn(PUTFIELD, "pkg/ExtendedArithmeticLib", "l1", "J");
			mv.visitVarInsn(ALOAD, 0);
			mv.visitVarInsn(ALOAD, 0);
			mv.visitFieldInsn(GETFIELD, "pkg/ExtendedArithmeticLib", "d2", "D");
			mv.visitVarInsn(ALOAD, 0);
			mv.visitFieldInsn(GETFIELD, "pkg/ExtendedArithmeticLib", "d3", "D");
			mv.visitInsn(DSUB);
			mv.visitFieldInsn(PUTFIELD, "pkg/ExtendedArithmeticLib", "d1", "D");
			mv.visitInsn(RETURN);
			mv.visitMaxs(0, 0);
			mv.visitEnd();
		}
		{
			mv = cw.visitMethod(ACC_PUBLIC, "doINeg", "(I)I", null, null);
			mv.visitCode();
			mv.visitVarInsn(ILOAD, 1);
			mv.visitInsn(INEG);
			mv.visitInsn(IRETURN);
			mv.visitMaxs(0, 0);
			mv.visitEnd();
		}
		{
			mv = cw.visitMethod(ACC_PUBLIC, "doCNeg", "(C)I", null, null);
			mv.visitCode();
			mv.visitVarInsn(ILOAD, 1);
			mv.visitInsn(INEG);
			mv.visitInsn(IRETURN);
			mv.visitMaxs(0, 0);
			mv.visitEnd();
		}
		{
			mv = cw.visitMethod(ACC_PUBLIC, "doSNeg", "(S)I", null, null);
			mv.visitCode();
			mv.visitVarInsn(ILOAD, 1);
			mv.visitInsn(INEG);
			mv.visitInsn(IRETURN);
			mv.visitMaxs(0, 0);
			mv.visitEnd();
		}
		{
			mv = cw.visitMethod(ACC_PUBLIC, "doBNeg", "(B)I", null, null);
			mv.visitCode();
			mv.visitVarInsn(ILOAD, 1);
			mv.visitInsn(INEG);
			mv.visitInsn(IRETURN);
			mv.visitMaxs(0, 0);
			mv.visitEnd();
		}
		{
			mv = cw.visitMethod(ACC_PUBLIC, "doLNeg", "(J)J", null, null);
			mv.visitCode();
			mv.visitVarInsn(LLOAD, 1);
			mv.visitInsn(LRETURN);
			mv.visitMaxs(0, 0);
			mv.visitEnd();
		}
		{
			mv = cw.visitMethod(ACC_PUBLIC, "doDNeg", "(D)D", null, null);
			mv.visitCode();
			mv.visitVarInsn(DLOAD, 1);
			mv.visitInsn(DNEG);
			mv.visitInsn(DRETURN);
			mv.visitMaxs(0, 0);
			mv.visitEnd();
		}
		{
			mv = cw.visitMethod(ACC_PUBLIC, "doFNeg", "(F)F", null, null);
			mv.visitCode();
			mv.visitVarInsn(FLOAD, 1);
			mv.visitInsn(FNEG);
			mv.visitInsn(FRETURN);
			mv.visitMaxs(0, 0);
			mv.visitEnd();
		}
		{
			mv = cw.visitMethod(ACC_PUBLIC, "doInc", "()I", null, null);
			mv.visitCode();
			mv.visitInsn(ICONST_0);
			mv.visitVarInsn(ISTORE, 0);
			mv.visitInsn(ICONST_0);
			mv.visitVarInsn(ISTORE, 1);
			Label l0 = new Label();
			mv.visitJumpInsn(GOTO, l0);
			Label l1 = new Label();
			mv.visitLabel(l1);
			mv.visitIincInsn(0, 4);
			mv.visitIincInsn(1, 1);
			mv.visitLabel(l0);
			mv.visitVarInsn(ILOAD, 1);
			mv.visitIntInsn(BIPUSH, 100);
			mv.visitJumpInsn(IF_ICMPLT, l1);
			mv.visitVarInsn(ILOAD, 0);
			mv.visitInsn(IRETURN);
			mv.visitMaxs(0, 0);
			mv.visitEnd();
			}
			cw.visitEnd();

	}

	@Override
	protected String getTargetClass() {
		return "pkg.ExtendedArithmeticLib";
	}

	@Override
	protected String getTargetFolder() {
		return "./testcode_asm_backend";
	}

	@Override
	protected String getClassPathFolder() {
		return "./testcode_asm_backend";
	}

}
