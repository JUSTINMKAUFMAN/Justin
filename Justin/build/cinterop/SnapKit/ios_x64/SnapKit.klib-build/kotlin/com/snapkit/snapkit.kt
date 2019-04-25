@file:kotlinx.cinterop.InteropStubs
@file:Suppress("UNUSED_VARIABLE", "UNUSED_EXPRESSION", "CONFLICTING_OVERLOADS", "RETURN_TYPE_MISMATCH_ON_INHERITANCE", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "WRONG_MODIFIER_CONTAINING_DECLARATION", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UNUSED_PARAMETER", "MANY_IMPL_MEMBER_NOT_IMPLEMENTED", "MANY_INTERFACES_MEMBER_NOT_IMPLEMENTED", "EXTENSION_SHADOWED_BY_MEMBER", "REDUNDANT_NULLABLE", "DEPRECATION")
package com.snapkit

import kotlin.native.SymbolName
import kotlinx.cinterop.*
import cnames.structs._NSZone
import kotlin.collections.List
import objcnames.classes.Protocol
import platform.CoreGraphics.CGFloat
import platform.Foundation.NSError
import platform.Foundation.NSErrorDomain
import platform.UIKit.NSLayoutAttribute
import platform.UIKit.NSLayoutConstraint
import platform.UIKit.NSLayoutConstraintMeta
import platform.UIKit.NSLayoutRelation
import platform.UIKit.UIInteractionProtocol
import platform.UIKit.UIInteractionProtocolMeta
import platform.UIKit.UIView
import platform.darwin.NSInteger
import platform.darwin.NSIntegerVar
import platform.darwin.NSObject
import platform.darwin.NSObjectMeta
import platform.darwin.NSObjectProtocol
import platform.darwin.NSObjectProtocolMeta
import platform.darwin.NSUInteger
import platform.posix.uint_least16_t
import platform.posix.uint_least32_t

// NOTE THIS FILE IS AUTO-GENERATED

fun UIGuidedAccessRestrictionStateForIdentifier(restrictionIdentifier: String): UIGuidedAccessRestrictionState {
    return UIGuidedAccessRestrictionState.byValue(kniBridge0(restrictionIdentifier.objcPtr()))
}

fun UIGuidedAccessConfigureAccessibilityFeatures(features: UIGuidedAccessAccessibilityFeature, enabled: Boolean, completion: (Boolean, NSError?) -> Unit): Unit {
    return kniBridge1(features, enabled.toByte(), createKotlinObjectHolder(completion))
}

@ExternalObjCClass("kniprot_com_snapkit0") interface UIGuidedAccessRestrictionDelegateProtocolMeta : NSObjectProtocolMeta {
}

@ExternalObjCClass("kniprot_com_snapkit0") interface UIGuidedAccessRestrictionDelegateProtocol : NSObjectProtocol {
    
    final val guidedAccessRestrictionIdentifiers: List<*>?
        get() = objcKniBridge8(nativeNullPtr, this.objcPtr())
    
    @ObjCMethod("guidedAccessRestrictionWithIdentifier:didChangeState:", "objcKniBridge2")
    fun guidedAccessRestrictionWithIdentifier(restrictionIdentifier: String, didChangeState: UIGuidedAccessRestrictionState): Unit
    
    @ObjCMethod("textForGuidedAccessRestrictionWithIdentifier:", "objcKniBridge4")
    fun textForGuidedAccessRestrictionWithIdentifier(restrictionIdentifier: String): String?
    
    @ObjCMethod("detailTextForGuidedAccessRestrictionWithIdentifier:", "objcKniBridge6")
    fun detailTextForGuidedAccessRestrictionWithIdentifier(restrictionIdentifier: String): String? = optional()
    
    @ObjCMethod("guidedAccessRestrictionIdentifiers", "objcKniBridge8")
    fun guidedAccessRestrictionIdentifiers(): List<*>?
}

@ExternalObjCClass("kniprot_com_snapkit9") interface UIPencilInteractionDelegateProtocolMeta : NSObjectProtocolMeta {
}

@ExternalObjCClass("kniprot_com_snapkit9") interface UIPencilInteractionDelegateProtocol : NSObjectProtocol {
    
    @ObjCMethod("pencilInteractionDidTap:", "objcKniBridge11")
    fun pencilInteractionDidTap(interaction: UIPencilInteraction): Unit = optional()
}

@ExternalObjCClass open class UIPencilInteractionMeta : NSObjectMeta, UIInteractionProtocolMeta {
    
    val preferredTapAction: UIPencilPreferredAction
        get() = objcKniBridge13(nativeNullPtr, this.objcPtr())
    
    @ObjCMethod("preferredTapAction", "objcKniBridge13")
    external open fun preferredTapAction(): UIPencilPreferredAction
    
    @ObjCMethod("new", "objcKniBridge15")
    external override fun new(): UIPencilInteraction?
    
    @ObjCMethod("allocWithZone:", "objcKniBridge17")
    external override fun allocWithZone(zone: CPointer<_NSZone>?): UIPencilInteraction?
    
    @ObjCMethod("alloc", "objcKniBridge19")
    external override fun alloc(): UIPencilInteraction?
    
    protected constructor() {}
}

@ExternalObjCClass open class UIPencilInteraction : NSObject, UIInteractionProtocol {
    companion object : UIPencilInteractionMeta(), ObjCClassOf<UIPencilInteraction> {}
    
    var delegate: UIPencilInteractionDelegateProtocol?
        get() = objcKniBridge21(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge23(nativeNullPtr, this.objcPtr(), value)
    
    var enabled: Boolean
        get() = objcKniBridge25(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge27(nativeNullPtr, this.objcPtr(), value)
    
    @ObjCMethod("delegate", "objcKniBridge21")
    external open fun delegate(): UIPencilInteractionDelegateProtocol?
    
    @ObjCMethod("setDelegate:", "objcKniBridge23")
    external open fun setDelegate(delegate: UIPencilInteractionDelegateProtocol?): Unit
    
    @ObjCMethod("isEnabled", "objcKniBridge25")
    external open fun isEnabled(): Boolean
    
    @ObjCMethod("setEnabled:", "objcKniBridge27")
    external open fun setEnabled(enabled: Boolean): Unit
    
    @ObjCMethod("init", "objcKniBridge29")
    external override fun init(): UIPencilInteraction?
    
    @ObjCConstructor("init", true)
    constructor() {}
    
    @ObjCMethod("willMoveToView:", "objcKniBridge31")
    external override fun willMoveToView(view: UIView?): Unit
    
    @ObjCMethod("didMoveToView:", "objcKniBridge33")
    external override fun didMoveToView(view: UIView?): Unit
    
    @ObjCMethod("view", "objcKniBridge35")
    external override fun view(): UIView?
    
    @ObjCMethod("isEqual:", "objcKniBridge37")
    external override fun isEqual(`object`: Any?): Boolean
    
    @ObjCMethod("class", "objcKniBridge39")
    external override fun `class`(): ObjCClass?
    
    @ObjCMethod("performSelector:", "objcKniBridge41")
    external override fun performSelector(aSelector: COpaquePointer?): Any?
    
    @ObjCMethod("performSelector:withObject:", "objcKniBridge43")
    external override fun performSelector(aSelector: COpaquePointer?, withObject: Any?): Any?
    
    @ObjCMethod("performSelector:withObject:withObject:", "objcKniBridge45")
    external override fun performSelector(aSelector: COpaquePointer?, withObject: Any?, _withObject: Any?): Any?
    
    @ObjCMethod("isProxy", "objcKniBridge47")
    external override fun isProxy(): Boolean
    
    @ObjCMethod("isKindOfClass:", "objcKniBridge49")
    external override fun isKindOfClass(aClass: ObjCClass?): Boolean
    
    @ObjCMethod("isMemberOfClass:", "objcKniBridge51")
    external override fun isMemberOfClass(aClass: ObjCClass?): Boolean
    
    @ObjCMethod("conformsToProtocol:", "objcKniBridge53")
    external override fun conformsToProtocol(aProtocol: Protocol?): Boolean
    
    @ObjCMethod("respondsToSelector:", "objcKniBridge55")
    external override fun respondsToSelector(aSelector: COpaquePointer?): Boolean
    
    @ObjCMethod("hash", "objcKniBridge57")
    external override fun hash(): NSUInteger
    
    @ObjCMethod("superclass", "objcKniBridge59")
    external override fun superclass(): ObjCClass?
    
    @ObjCMethod("description", "objcKniBridge61")
    external override fun description(): String?
    
    @ObjCMethod("debugDescription", "objcKniBridge63")
    external override fun debugDescription(): String?
}

@ExternalObjCClass("", "_TtC7SnapKit16LayoutConstraint") open class LayoutConstraintMeta : NSLayoutConstraintMeta {
    
    @ObjCMethod("constraintWithItem:attribute:relatedBy:toItem:attribute:multiplier:constant:", "objcKniBridge65")
    external override fun constraintWithItem(view1: Any, attribute: NSLayoutAttribute, relatedBy: NSLayoutRelation, toItem: Any?, _attribute: NSLayoutAttribute, multiplier: CGFloat, constant: CGFloat): LayoutConstraint
    
    @ObjCMethod("new", "objcKniBridge67")
    external override fun new(): LayoutConstraint?
    
    @ObjCMethod("allocWithZone:", "objcKniBridge69")
    external override fun allocWithZone(zone: CPointer<_NSZone>?): LayoutConstraint?
    
    @ObjCMethod("alloc", "objcKniBridge71")
    external override fun alloc(): LayoutConstraint?
    
    protected constructor() {}
}

@ExternalObjCClass("", "_TtC7SnapKit16LayoutConstraint") open class LayoutConstraint : NSLayoutConstraint {
    companion object : LayoutConstraintMeta(), ObjCClassOf<LayoutConstraint> {}
    
    @ObjCMethod("init", "objcKniBridge73")
    external override fun init(): LayoutConstraint
    
    @ObjCConstructor("init", true)
    constructor() {}
}

const val SWIFT_TYPEDEFS: Int = 1

val UIGuidedAccessErrorDomain: NSErrorDomain?
    get() = interpretObjCPointerOrNull<String>(kniBridge75())

var SnapKitVersionNumber: Double
    get() = kniBridge76()
    set(value) { kniBridge77(value) }

val SnapKitVersionString: CArrayPointer<UByteVar>
    get() = interpretCPointer<UByteVar>(kniBridge78())!!

typealias UIGuidedAccessErrorCodeVar = LongVarOf<UIGuidedAccessErrorCode>
typealias UIGuidedAccessErrorCode = NSInteger

val UIGuidedAccessErrorPermissionDenied: UIGuidedAccessErrorCode get() = 0
val UIGuidedAccessErrorFailed: UIGuidedAccessErrorCode get() = 9223372036854775807

enum class UIGuidedAccessRestrictionState(override val value: NSInteger) : CEnum {
    UIGuidedAccessRestrictionStateAllow(0),
    UIGuidedAccessRestrictionStateDeny(1),
    ;
    
    companion object {
        fun byValue(value: NSInteger) = UIGuidedAccessRestrictionState.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(NSIntegerVar.size.toInt())
        var value: UIGuidedAccessRestrictionState
            get() = byValue(this.reinterpret<NSIntegerVar>().value)
            set(value) { this.reinterpret<NSIntegerVar>().value = value.value }
    }
}

typealias UIGuidedAccessAccessibilityFeatureVar = ULongVarOf<UIGuidedAccessAccessibilityFeature>
typealias UIGuidedAccessAccessibilityFeature = NSUInteger

val UIGuidedAccessAccessibilityFeatureVoiceOver: UIGuidedAccessAccessibilityFeature get() = 1u
val UIGuidedAccessAccessibilityFeatureZoom: UIGuidedAccessAccessibilityFeature get() = 2u
val UIGuidedAccessAccessibilityFeatureAssistiveTouch: UIGuidedAccessAccessibilityFeature get() = 4u
val UIGuidedAccessAccessibilityFeatureInvertColors: UIGuidedAccessAccessibilityFeature get() = 8u
val UIGuidedAccessAccessibilityFeatureGrayscaleDisplay: UIGuidedAccessAccessibilityFeature get() = 16u

typealias UIPencilPreferredActionVar = LongVarOf<UIPencilPreferredAction>
typealias UIPencilPreferredAction = NSInteger

val UIPencilPreferredActionIgnore: UIPencilPreferredAction get() = 0
val UIPencilPreferredActionSwitchEraser: UIPencilPreferredAction get() = 1
val UIPencilPreferredActionSwitchPrevious: UIPencilPreferredAction get() = 2
val UIPencilPreferredActionShowColorPalette: UIPencilPreferredAction get() = 3

typealias char16_tVar = UShortVarOf<char16_t>
typealias char16_t = uint_least16_t

typealias char32_tVar = UIntVarOf<char32_t>
typealias char32_t = uint_least32_t

@kotlin.native.internal.ExportForCompiler
@ObjCBridge("guidedAccessRestrictionWithIdentifier:didChangeState:", "v32@0:8@16q24", "knimi_com_snapkit1")
internal fun objcKniBridge2(kniSC: NativePtr, kniR: NativePtr, restrictionIdentifier: String, didChangeState: UIGuidedAccessRestrictionState): Unit {
    return kniBridge3(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, restrictionIdentifier.objcPtr(), didChangeState.value)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("textForGuidedAccessRestrictionWithIdentifier:", "@24@0:8@16", "knimi_com_snapkit3")
internal fun objcKniBridge4(kniSC: NativePtr, kniR: NativePtr, restrictionIdentifier: String): String? {
    return interpretObjCPointerOrNull<String>(kniBridge5(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, restrictionIdentifier.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("detailTextForGuidedAccessRestrictionWithIdentifier:", "@24@0:8@16", "knimi_com_snapkit5")
internal fun objcKniBridge6(kniSC: NativePtr, kniR: NativePtr, restrictionIdentifier: String): String? {
    return interpretObjCPointerOrNull<String>(kniBridge7(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, restrictionIdentifier.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("guidedAccessRestrictionIdentifiers", "@16@0:8", "knimi_com_snapkit7")
internal fun objcKniBridge8(kniSC: NativePtr, kniR: NativePtr): List<*>? {
    return interpretObjCPointerOrNull<List<*>>(kniBridge9(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("pencilInteractionDidTap:", "v24@0:8@16", "knimi_com_snapkit10")
internal fun objcKniBridge11(kniSC: NativePtr, kniR: NativePtr, interaction: UIPencilInteraction): Unit {
    return kniBridge11(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, interaction.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("preferredTapAction", "q16@0:8", "knimi_com_snapkit12")
internal fun objcKniBridge13(kniSC: NativePtr, kniR: NativePtr): UIPencilPreferredAction {
    return kniBridge13(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("new", "@16@0:8", "knimi_com_snapkit14")
internal fun objcKniBridge15(kniSC: NativePtr, kniR: NativePtr): UIPencilInteraction? {
    return interpretObjCPointerOrNull<UIPencilInteraction>(kniBridge15(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("allocWithZone:", "@24@0:8^{_NSZone=}16", "knimi_com_snapkit16")
internal fun objcKniBridge17(kniSC: NativePtr, kniR: NativePtr, zone: CPointer<_NSZone>?): UIPencilInteraction? {
    return interpretObjCPointerOrNull<UIPencilInteraction>(kniBridge17(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, zone.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("alloc", "@16@0:8", "knimi_com_snapkit18")
internal fun objcKniBridge19(kniSC: NativePtr, kniR: NativePtr): UIPencilInteraction? {
    return interpretObjCPointerOrNull<UIPencilInteraction>(kniBridge19(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("delegate", "@16@0:8", "knimi_com_snapkit20")
internal fun objcKniBridge21(kniSC: NativePtr, kniR: NativePtr): UIPencilInteractionDelegateProtocol? {
    return interpretObjCPointerOrNull<UIPencilInteractionDelegateProtocol>(kniBridge21(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setDelegate:", "v24@0:8@16", "knimi_com_snapkit22")
internal fun objcKniBridge23(kniSC: NativePtr, kniR: NativePtr, delegate: UIPencilInteractionDelegateProtocol?): Unit {
    return kniBridge23(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, delegate.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("isEnabled", "B16@0:8", "knimi_com_snapkit24")
internal fun objcKniBridge25(kniSC: NativePtr, kniR: NativePtr): Boolean {
    return kniBridge25(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setEnabled:", "v20@0:8B16", "knimi_com_snapkit26")
internal fun objcKniBridge27(kniSC: NativePtr, kniR: NativePtr, enabled: Boolean): Unit {
    return kniBridge27(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, enabled.toByte())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("init", "@16@0:8", "knimi_com_snapkit28")
internal fun objcKniBridge29(kniSC: NativePtr, kniR: NativePtr): UIPencilInteraction? {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<UIPencilInteraction>(kniBridge29(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("willMoveToView:", "v24@0:8@16", "knimi_com_snapkit30")
internal fun objcKniBridge31(kniSC: NativePtr, kniR: NativePtr, view: UIView?): Unit {
    return kniBridge31(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, view.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("didMoveToView:", "v24@0:8@16", "knimi_com_snapkit32")
internal fun objcKniBridge33(kniSC: NativePtr, kniR: NativePtr, view: UIView?): Unit {
    return kniBridge33(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, view.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("view", "@16@0:8", "knimi_com_snapkit34")
internal fun objcKniBridge35(kniSC: NativePtr, kniR: NativePtr): UIView? {
    return interpretObjCPointerOrNull<UIView>(kniBridge35(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("isEqual:", "B24@0:8@16", "knimi_com_snapkit36")
internal fun objcKniBridge37(kniSC: NativePtr, kniR: NativePtr, `object`: Any?): Boolean {
    return kniBridge37(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, `object`.objcPtr()).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("class", "#16@0:8", "knimi_com_snapkit38")
internal fun objcKniBridge39(kniSC: NativePtr, kniR: NativePtr): ObjCClass? {
    return interpretObjCPointerOrNull<ObjCClass>(kniBridge39(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("performSelector:", "@24@0:8:16", "knimi_com_snapkit40")
internal fun objcKniBridge41(kniSC: NativePtr, kniR: NativePtr, aSelector: COpaquePointer?): Any? {
    return interpretObjCPointerOrNull<Any>(kniBridge41(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aSelector.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("performSelector:withObject:", "@32@0:8:16@24", "knimi_com_snapkit42")
internal fun objcKniBridge43(kniSC: NativePtr, kniR: NativePtr, aSelector: COpaquePointer?, withObject: Any?): Any? {
    return interpretObjCPointerOrNull<Any>(kniBridge43(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aSelector.rawValue, withObject.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("performSelector:withObject:withObject:", "@40@0:8:16@24@32", "knimi_com_snapkit44")
internal fun objcKniBridge45(kniSC: NativePtr, kniR: NativePtr, aSelector: COpaquePointer?, withObject: Any?, _withObject: Any?): Any? {
    return interpretObjCPointerOrNull<Any>(kniBridge45(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aSelector.rawValue, withObject.objcPtr(), _withObject.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("isProxy", "B16@0:8", "knimi_com_snapkit46")
internal fun objcKniBridge47(kniSC: NativePtr, kniR: NativePtr): Boolean {
    return kniBridge47(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("isKindOfClass:", "B24@0:8#16", "knimi_com_snapkit48")
internal fun objcKniBridge49(kniSC: NativePtr, kniR: NativePtr, aClass: ObjCClass?): Boolean {
    return kniBridge49(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aClass.objcPtr()).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("isMemberOfClass:", "B24@0:8#16", "knimi_com_snapkit50")
internal fun objcKniBridge51(kniSC: NativePtr, kniR: NativePtr, aClass: ObjCClass?): Boolean {
    return kniBridge51(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aClass.objcPtr()).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("conformsToProtocol:", "B24@0:8@16", "knimi_com_snapkit52")
internal fun objcKniBridge53(kniSC: NativePtr, kniR: NativePtr, aProtocol: Protocol?): Boolean {
    return kniBridge53(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aProtocol.objcPtr()).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("respondsToSelector:", "B24@0:8:16", "knimi_com_snapkit54")
internal fun objcKniBridge55(kniSC: NativePtr, kniR: NativePtr, aSelector: COpaquePointer?): Boolean {
    return kniBridge55(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aSelector.rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("hash", "Q16@0:8", "knimi_com_snapkit56")
internal fun objcKniBridge57(kniSC: NativePtr, kniR: NativePtr): NSUInteger {
    return kniBridge57(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("superclass", "#16@0:8", "knimi_com_snapkit58")
internal fun objcKniBridge59(kniSC: NativePtr, kniR: NativePtr): ObjCClass? {
    return interpretObjCPointerOrNull<ObjCClass>(kniBridge59(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("description", "@16@0:8", "knimi_com_snapkit60")
internal fun objcKniBridge61(kniSC: NativePtr, kniR: NativePtr): String? {
    return interpretObjCPointerOrNull<String>(kniBridge61(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("debugDescription", "@16@0:8", "knimi_com_snapkit62")
internal fun objcKniBridge63(kniSC: NativePtr, kniR: NativePtr): String? {
    return interpretObjCPointerOrNull<String>(kniBridge63(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("constraintWithItem:attribute:relatedBy:toItem:attribute:multiplier:constant:", "@72@0:8@16q24q32@40q48d56d64", "knimi_com_snapkit64")
internal fun objcKniBridge65(kniSC: NativePtr, kniR: NativePtr, view1: Any, attribute: NSLayoutAttribute, relatedBy: NSLayoutRelation, toItem: Any?, _attribute: NSLayoutAttribute, multiplier: CGFloat, constant: CGFloat): LayoutConstraint {
    return interpretObjCPointerOrNull<LayoutConstraint>(kniBridge65(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, view1.objcPtr(), attribute, relatedBy, toItem.objcPtr(), _attribute, multiplier, constant))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("new", "@16@0:8", "knimi_com_snapkit66")
internal fun objcKniBridge67(kniSC: NativePtr, kniR: NativePtr): LayoutConstraint? {
    return interpretObjCPointerOrNull<LayoutConstraint>(kniBridge67(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("allocWithZone:", "@24@0:8^{_NSZone=}16", "knimi_com_snapkit68")
internal fun objcKniBridge69(kniSC: NativePtr, kniR: NativePtr, zone: CPointer<_NSZone>?): LayoutConstraint? {
    return interpretObjCPointerOrNull<LayoutConstraint>(kniBridge69(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, zone.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("alloc", "@16@0:8", "knimi_com_snapkit70")
internal fun objcKniBridge71(kniSC: NativePtr, kniR: NativePtr): LayoutConstraint? {
    return interpretObjCPointerOrNull<LayoutConstraint>(kniBridge71(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("init", "@16@0:8", "knimi_com_snapkit72")
internal fun objcKniBridge73(kniSC: NativePtr, kniR: NativePtr): LayoutConstraint {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<LayoutConstraint>(kniBridge73(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@SymbolName("com_snapkit_kniBridge0")
private external fun kniBridge0(p0: NativePtr): Long
@kotlin.native.internal.ExportForCppRuntime("com_snapkit_kniBridge2")
private fun kniBridge2(p0: Byte, p1: NativePtr, p2: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(Boolean, NSError?) -> Unit>(interpretObjCPointerOrNull<Any>(p2))(p0.toBoolean(), interpretObjCPointerOrNull<NSError>(p1))
}
@SymbolName("com_snapkit_kniBridge1")
private external fun kniBridge1(p0: ULong, p1: Byte, p2: NativePtr): Unit
@SymbolName("com_snapkit_kniBridge3")
private external fun kniBridge3(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: Long): Unit
@kotlin.native.internal.ExportForCppRuntime("com_snapkit_kniBridge4")
private fun kniBridge4(p0: NativePtr, p1: NativePtr, p2: Long): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIGuidedAccessRestrictionDelegateProtocol>().guidedAccessRestrictionWithIdentifier(restrictionIdentifier = interpretObjCPointerOrNull<String>(p1)!!, didChangeState = UIGuidedAccessRestrictionState.byValue(p2))
}
@SymbolName("com_snapkit_kniBridge5")
private external fun kniBridge5(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_snapkit_kniBridge6")
private fun kniBridge6(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIGuidedAccessRestrictionDelegateProtocol>().textForGuidedAccessRestrictionWithIdentifier(restrictionIdentifier = interpretObjCPointerOrNull<String>(p1)!!).objcPtr())
}
@SymbolName("com_snapkit_kniBridge7")
private external fun kniBridge7(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_snapkit_kniBridge8")
private fun kniBridge8(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIGuidedAccessRestrictionDelegateProtocol>().detailTextForGuidedAccessRestrictionWithIdentifier(restrictionIdentifier = interpretObjCPointerOrNull<String>(p1)!!).objcPtr())
}
@SymbolName("com_snapkit_kniBridge9")
private external fun kniBridge9(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_snapkit_kniBridge10")
private fun kniBridge10(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIGuidedAccessRestrictionDelegateProtocol>().guidedAccessRestrictionIdentifiers().objcPtr())
}
@SymbolName("com_snapkit_kniBridge11")
private external fun kniBridge11(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_snapkit_kniBridge12")
private fun kniBridge12(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteractionDelegateProtocol>().pencilInteractionDidTap(interaction = interpretObjCPointerOrNull<UIPencilInteraction>(p1)!!)
}
@SymbolName("com_snapkit_kniBridge13")
private external fun kniBridge13(p0: NativePtr, p1: NativePtr): Long
@kotlin.native.internal.ExportForCppRuntime("com_snapkit_kniBridge14")
private fun kniBridge14(p0: NativePtr): Long {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteractionMeta>().preferredTapAction()
}
@SymbolName("com_snapkit_kniBridge15")
private external fun kniBridge15(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_snapkit_kniBridge16")
private fun kniBridge16(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteractionMeta>().new().objcPtr())
}
@SymbolName("com_snapkit_kniBridge17")
private external fun kniBridge17(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_snapkit_kniBridge18")
private fun kniBridge18(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteractionMeta>().allocWithZone(zone = interpretCPointer<_NSZone>(p1)).objcPtr())
}
@SymbolName("com_snapkit_kniBridge19")
private external fun kniBridge19(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_snapkit_kniBridge20")
private fun kniBridge20(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteractionMeta>().alloc().objcPtr())
}
@SymbolName("com_snapkit_kniBridge21")
private external fun kniBridge21(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_snapkit_kniBridge22")
private fun kniBridge22(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteraction>().delegate().objcPtr())
}
@SymbolName("com_snapkit_kniBridge23")
private external fun kniBridge23(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_snapkit_kniBridge24")
private fun kniBridge24(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteraction>().setDelegate(delegate = interpretObjCPointerOrNull<UIPencilInteractionDelegateProtocol>(p1))
}
@SymbolName("com_snapkit_kniBridge25")
private external fun kniBridge25(p0: NativePtr, p1: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_snapkit_kniBridge26")
private fun kniBridge26(p0: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteraction>().isEnabled().toByte()
}
@SymbolName("com_snapkit_kniBridge27")
private external fun kniBridge27(p0: NativePtr, p1: NativePtr, p2: Byte): Unit
@kotlin.native.internal.ExportForCppRuntime("com_snapkit_kniBridge28")
private fun kniBridge28(p0: NativePtr, p1: Byte): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteraction>().setEnabled(enabled = p1.toBoolean())
}
@SymbolName("com_snapkit_kniBridge29")
private external fun kniBridge29(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_snapkit_kniBridge30")
private fun kniBridge30(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteraction>().init().objcPtr())
}
@SymbolName("com_snapkit_kniBridge31")
private external fun kniBridge31(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_snapkit_kniBridge32")
private fun kniBridge32(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteraction>().willMoveToView(view = interpretObjCPointerOrNull<UIView>(p1))
}
@SymbolName("com_snapkit_kniBridge33")
private external fun kniBridge33(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_snapkit_kniBridge34")
private fun kniBridge34(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteraction>().didMoveToView(view = interpretObjCPointerOrNull<UIView>(p1))
}
@SymbolName("com_snapkit_kniBridge35")
private external fun kniBridge35(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_snapkit_kniBridge36")
private fun kniBridge36(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteraction>().view().objcPtr())
}
@SymbolName("com_snapkit_kniBridge37")
private external fun kniBridge37(p0: NativePtr, p1: NativePtr, p2: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_snapkit_kniBridge38")
private fun kniBridge38(p0: NativePtr, p1: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteraction>().isEqual(`object` = interpretObjCPointerOrNull<Any>(p1)).toByte()
}
@SymbolName("com_snapkit_kniBridge39")
private external fun kniBridge39(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_snapkit_kniBridge40")
private fun kniBridge40(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteraction>().`class`().objcPtr())
}
@SymbolName("com_snapkit_kniBridge41")
private external fun kniBridge41(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_snapkit_kniBridge42")
private fun kniBridge42(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteraction>().performSelector(aSelector = interpretCPointer<COpaque>(p1)).objcPtr())
}
@SymbolName("com_snapkit_kniBridge43")
private external fun kniBridge43(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_snapkit_kniBridge44")
private fun kniBridge44(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteraction>().performSelector(aSelector = interpretCPointer<COpaque>(p1), withObject = interpretObjCPointerOrNull<Any>(p2)).objcPtr())
}
@SymbolName("com_snapkit_kniBridge45")
private external fun kniBridge45(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_snapkit_kniBridge46")
private fun kniBridge46(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteraction>().performSelector(aSelector = interpretCPointer<COpaque>(p1), withObject = interpretObjCPointerOrNull<Any>(p2), _withObject = interpretObjCPointerOrNull<Any>(p3)).objcPtr())
}
@SymbolName("com_snapkit_kniBridge47")
private external fun kniBridge47(p0: NativePtr, p1: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_snapkit_kniBridge48")
private fun kniBridge48(p0: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteraction>().isProxy().toByte()
}
@SymbolName("com_snapkit_kniBridge49")
private external fun kniBridge49(p0: NativePtr, p1: NativePtr, p2: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_snapkit_kniBridge50")
private fun kniBridge50(p0: NativePtr, p1: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteraction>().isKindOfClass(aClass = interpretObjCPointerOrNull<ObjCClass>(p1)).toByte()
}
@SymbolName("com_snapkit_kniBridge51")
private external fun kniBridge51(p0: NativePtr, p1: NativePtr, p2: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_snapkit_kniBridge52")
private fun kniBridge52(p0: NativePtr, p1: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteraction>().isMemberOfClass(aClass = interpretObjCPointerOrNull<ObjCClass>(p1)).toByte()
}
@SymbolName("com_snapkit_kniBridge53")
private external fun kniBridge53(p0: NativePtr, p1: NativePtr, p2: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_snapkit_kniBridge54")
private fun kniBridge54(p0: NativePtr, p1: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteraction>().conformsToProtocol(aProtocol = interpretObjCPointerOrNull<Protocol>(p1)).toByte()
}
@SymbolName("com_snapkit_kniBridge55")
private external fun kniBridge55(p0: NativePtr, p1: NativePtr, p2: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_snapkit_kniBridge56")
private fun kniBridge56(p0: NativePtr, p1: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteraction>().respondsToSelector(aSelector = interpretCPointer<COpaque>(p1)).toByte()
}
@SymbolName("com_snapkit_kniBridge57")
private external fun kniBridge57(p0: NativePtr, p1: NativePtr): ULong
@kotlin.native.internal.ExportForCppRuntime("com_snapkit_kniBridge58")
private fun kniBridge58(p0: NativePtr): ULong {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteraction>().hash()
}
@SymbolName("com_snapkit_kniBridge59")
private external fun kniBridge59(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_snapkit_kniBridge60")
private fun kniBridge60(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteraction>().superclass().objcPtr())
}
@SymbolName("com_snapkit_kniBridge61")
private external fun kniBridge61(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_snapkit_kniBridge62")
private fun kniBridge62(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteraction>().description().objcPtr())
}
@SymbolName("com_snapkit_kniBridge63")
private external fun kniBridge63(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_snapkit_kniBridge64")
private fun kniBridge64(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteraction>().debugDescription().objcPtr())
}
@SymbolName("com_snapkit_kniBridge65")
private external fun kniBridge65(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: Long, p4: Long, p5: NativePtr, p6: Long, p7: Double, p8: Double): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_snapkit_kniBridge66")
private fun kniBridge66(p0: NativePtr, p1: NativePtr, p2: Long, p3: Long, p4: NativePtr, p5: Long, p6: Double, p7: Double): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<LayoutConstraintMeta>().constraintWithItem(view1 = interpretObjCPointerOrNull<Any>(p1)!!, attribute = p2, relatedBy = p3, toItem = interpretObjCPointerOrNull<Any>(p4), _attribute = p5, multiplier = p6, constant = p7).objcPtr())
}
@SymbolName("com_snapkit_kniBridge67")
private external fun kniBridge67(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_snapkit_kniBridge68")
private fun kniBridge68(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<LayoutConstraintMeta>().new().objcPtr())
}
@SymbolName("com_snapkit_kniBridge69")
private external fun kniBridge69(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_snapkit_kniBridge70")
private fun kniBridge70(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<LayoutConstraintMeta>().allocWithZone(zone = interpretCPointer<_NSZone>(p1)).objcPtr())
}
@SymbolName("com_snapkit_kniBridge71")
private external fun kniBridge71(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_snapkit_kniBridge72")
private fun kniBridge72(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<LayoutConstraintMeta>().alloc().objcPtr())
}
@SymbolName("com_snapkit_kniBridge73")
private external fun kniBridge73(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_snapkit_kniBridge74")
private fun kniBridge74(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<LayoutConstraint>().init().objcPtr())
}
@SymbolName("com_snapkit_kniBridge75")
private external fun kniBridge75(): NativePtr
@SymbolName("com_snapkit_kniBridge76")
private external fun kniBridge76(): Double
@SymbolName("com_snapkit_kniBridge77")
private external fun kniBridge77(p0: Double): Unit
@SymbolName("com_snapkit_kniBridge78")
private external fun kniBridge78(): NativePtr
